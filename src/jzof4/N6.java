package jzof4;

public class N6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode r1=new ListNode(1);
		ListNode r2=new ListNode(2);
		ListNode r3=new ListNode(3);
		ListNode r4=new ListNode(4);
		r1.next=r2;
		r2.next=r3;
		r3.next=r4;
		solve(r1);
	}
    public static void solve(ListNode r) {
    	if(r!=null) {
    		solve(r.next);	
            System.out.print(r.value+" ");
    	}
    }
}
