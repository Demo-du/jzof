package jzof2;

public class N35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void CloneNodes(ComplexListNode head){
    	ComplexListNode node=head;
    	while(node!=null){
    		ComplexListNode cloneN=new ComplexListNode();
    		cloneN.value=node.value;
    		cloneN.next=node.next;
    		cloneN.slib=null;
    		node.next=cloneN;
    		node=cloneN.next;
    	}
    }
    public void ConnectSiblingNodes(ComplexListNode head){
    	ComplexListNode node=head;
    	while(node!=null){
    		ComplexListNode pclone=node.next;
    		if(node.slib!=null){
    			pclone.slib=node.slib.next;
    		}
    		node=pclone.next;
    	}
    }
    public  ComplexListNode ReconnectNodes(ComplexListNode head){
    	ComplexListNode node=head;
    	ComplexListNode clonehead=null;
    	ComplexListNode clonenode=null;
    	if(node!=null){
    		clonehead=clonenode=node.next;
    		node.next=clonenode.next;
    		node=node.next;
    	}
    	while(node!=null){
    		clonenode.next=node.next;
    		clonenode=clonenode.next;
    		node.next=clonenode.next;
    		node=node.next;
    	}
    	return clonehead;
    }
    ComplexListNode clonec(ComplexListNode head){
    	CloneNodes(head);
    	ConnectSiblingNodes(head);
    	return ReconnectNodes(head);
    }
}
