package jzof2;

public class N18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		N18 n18=new N18();
		n18.solve(n1,5);
		ListNode tmp=new ListNode();
		tmp.next=n1;
		ListNode r=tmp;
		while(r.next!=null){
			System.out.print(r.next.value+" ");
			r=r.next;
		}
        System.out.println();
	}
    public void solve(ListNode r,int n){
    	if(r==null){
    		return ;
    	}
    	ListNode tmp=new ListNode();
    	tmp.next=r;
    	ListNode p1=tmp;
    	ListNode p2=r;
    	while(p2.value!=n&&p2!=null){
    		p1=p1.next;
    		p2=p2.next;
    	}
    	del(p1,p2);
    }
    public void del(ListNode p1,ListNode p2){
    	p1.next=p2.next;
    	p2.next=null;
    }
}
