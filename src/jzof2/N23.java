package jzof2;


public class N23 {

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
		ListNode a6=new ListNode(6);
		a1.next=a2;
		a2.next=a3;
		a3.next=a4;
		a4.next=a5;
		a5.next=a6;
		a6.next=a3;
		N23 n23=new N23();
		System.out.println(n23.openList(a1).value);
	}
    public ListNode  meet(ListNode r){
    	if(r==null){
    		return null;
    	}
    	ListNode r1=r;
    	ListNode r2=r.next;
    	while(r1!=null&&r2!=null&&r2.next!=null){
    		if(r1==r2){
    			return r2;
    		}
    		r1=r1.next;
    		r2=r2.next.next;
    	}
    	return null;
    }
    public ListNode openList(ListNode r){
    	ListNode meetnode=meet(r);
    	//System.out.println("ssss");
    	ListNode tmp=meetnode;
    	int num=1;
    	while(tmp.next!=meetnode){
    		num++;
    		tmp=tmp.next;
    	}
    	//System.out.println(num);
    	ListNode h2=r;
    	for(int i=0;i<num;i++){
    		h2=h2.next;
    	}
    	ListNode h3=r;
    	while(h2!=h3){
    		//System.out.println(h2.value+" "+h3.value);
    		h2=h2.next;
    		h3=h3.next;
    	}
    	return h2;
    }
}
