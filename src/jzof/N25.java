package jzof;

public class N25 {

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
		ListNode n6=new ListNode(6);
		ListNode n7=new ListNode(7);
		n1.next=n3;
		n3.next=n5;
		n5.next=n7;
		n2.next=n4;
		n4.next=n6;
		ListNode nn=Merge(n1,n2);
		while(nn.next!=null){
			System.out.println(nn.value);
			nn=nn.next;
		}
	}
    public static ListNode Merge(ListNode p1,ListNode p2){
    	if(p1==null){
    		return p2;
    	}
    	if(p2==null){
    		return p1;
    	}
    	ListNode p3=null;
    	if(p1.value<p2.value){
    		p3=p1;
    		p3.next=Merge(p1.next,p2);
    	}else{
    		p3=p2;
    		p3.next=Merge(p1,p2.next);
    	}
    	return p3;
    }
}
