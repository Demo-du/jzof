package jzof2;

public class N22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N22 n22=new N22();
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        System.out.println(n22.print(n1, 0).value);
	}
    public ListNode print(ListNode r,int k){
    	if(r==null){
    		return null;
    	}
    	ListNode tmp=new ListNode(-1);
    	tmp.next=r;
    	for(int i=0;i<k-1;i++){
    		r=r.next;
    		if(r==null){
    			return null;
    		}
    	}
    	while(r!=null){
    		tmp=tmp.next;
    		r=r.next;
    	}
    	return tmp;
    }
}
