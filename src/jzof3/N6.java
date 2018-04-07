package jzof3;


public class N6 {

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
		fanzhuan(n1);
	}
    public static void fanzhuan(ListNode head){
    	if(head!=null){
    		fanzhuan(head.next);
    		System.out.print(head.value+" ");
    	}
    }
}
