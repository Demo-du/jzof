package jzof;

public class N24 {

	/**
	 * @param args ListNode
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		System.out.println(ReverList(n1).value);
	}
    public static ListNode ReverList(ListNode pHead){
    	ListNode pReveredHead=null;
    	ListNode pNode=pHead;
    	ListNode pPrev=null;
    	while(pNode!=null){
    		ListNode pNext=pNode.next;
    		if(pNext==null){
    			pReveredHead=pNode;
    		}
    		pNode.next=pPrev;
    		pPrev=pNode;
    		pNode=pNext;
    	}
    	return pReveredHead;
    }
}
