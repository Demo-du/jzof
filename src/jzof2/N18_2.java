package jzof2;

public class N18_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N18_2 n18=new N18_2();
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(2);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n18.solve(n1);
	}
    public void solve(ListNode r){
    	ListNode tmp=new ListNode(-1);
    	tmp.next=r;
    	ListNode p1=tmp;
    	ListNode p2=r;
    	while(p2!=null){
    		p1=p1.next;
    		p2=p2.next;
    		while(p2!=null&&p1.value==p2.value){
    			p2=p2.next;
    			p1.next=p2;
    		}
    	}
    	while(tmp.next!=null){
    		tmp=tmp.next;
    		System.out.print(tmp.value+" ");
    	}
    }
}
