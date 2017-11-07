package jzof;

public class N52 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N52 n52=new N52();
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		ListNode n7=new ListNode(7);
		n1.next=n2;
		n2.next=n3;
		n3.next=n6;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		ListNode res=n52.find(n1, n4);
		System.out.println(res.value);
	}
	public ListNode find(ListNode h1,ListNode h2){
		int length1=getlength(h1);
		int length2=getlength(h2);
		int dis=length1-length2;
		ListNode plong=h1;
		ListNode pshot=h2;
		if(dis<0){
			plong=h2;
			pshot=h1;
			dis=length2-length1;
		}
		for(int i=0;i<dis;i++){
			plong=plong.next;
		}
		while(plong!=null&&pshot!=null&&pshot!=plong){
			pshot=pshot.next;
			plong=plong.next;
		}
		return plong;
	}
	public int getlength(ListNode h){
		ListNode p=h;
		int length=0;
		while(p!=null){
			length++;
			p=p.next;
		}
		return length;
	}

}
