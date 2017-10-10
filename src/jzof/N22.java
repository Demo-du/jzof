package jzof;

public class N22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a1=new ListNode(1);
		ListNode a2=new ListNode(2);
		ListNode a3=new ListNode(3);
		ListNode a4=new ListNode(4);
		ListNode a5=new ListNode(5);
		a1.next=a2;
		a2.next=a3;
		a3.next=a4;
		a4.next=a5;
		System.out.println(FindKthToTail(a1,2).value);

	}
	public static ListNode FindKthToTail(ListNode head,int k){
		if(head==null||k==0){
			return null;
		}
		ListNode h1=head;
		ListNode h2=head;
		for(int i=0;i<k-1;i++){
			if(h1.next!=null){
				h1=h1.next;
			}else{
				return null;
			}
		}
		while(h1.next!=null){
			h1=h1.next;
			h2=h2.next;
		}
		return h2;
	}
}
class ListNode{
	int value;
	ListNode next;
	ListNode(int n){
		value=n;
	}
}