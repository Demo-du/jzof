package jzof3;


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
		ListNode tmp=n24.fanzhuan(n1);
		while(tmp!=null){
			System.out.println(tmp.value);
			tmp=tmp.next;
		}
	}
    public ListNode fanzhuan(ListNode head){
    	if(head==null){
    		return null;
    	}
    	ListNode pre=null;
    	ListNode h=head;
    	ListNode newh=null;
    	while(h!=null){
    		ListNode next=h.next;
    		h.next=pre;
    		pre=h;
    		newh=pre;
    		h=next;
    	}
    	return newh;
    }
}
