package jzof2;


public class N24 {

	/**
	 * @param args
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
		N24 n24=new N24();
		ListNode tmp=n24.rev(n1);
		while(tmp!=null){
			System.out.println(tmp.value);
			tmp=tmp.next;
		}
	}
    public ListNode rev(ListNode r){
    	if(r==null){
    		return null;
    	}
    	ListNode pre=null;
    	ListNode newhead=null;
    	ListNode r1=r;
    	while(r1!=null){
    		ListNode next=r1.next;
    		if(r1.next==null){
    			newhead=r1;
    		}
    		r1.next=pre;
    		pre=r1;
    		r1=next;
    	}
    	return newhead;
    }
}
