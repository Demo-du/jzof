package jzof;

public class N35 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexListNode n1=new ComplexListNode(1);
		ComplexListNode n2=new ComplexListNode(2);
		ComplexListNode n3=new ComplexListNode(3);
		ComplexListNode n4=new ComplexListNode(4);
		ComplexListNode n5=new ComplexListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n1.slib=n3;
		n2.slib=n5;
		n4.slib=n2;
		N35 n35=new N35();
		ComplexListNode c=n35.clonec(n1);
		System.out.println(c.slib.value);
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
class ComplexListNode{
	int value;
	ComplexListNode next;
	ComplexListNode slib;
	ComplexListNode(int i){
		this.value=i;
	}
	ComplexListNode(){

	}
}