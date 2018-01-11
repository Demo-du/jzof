package jzof2;

public class N25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode merge(ListNode r1,ListNode r2){
    	if(r1==null){
    		return r2;
    	}
    	if(r2==null){
    		return r1;
    	}
    	ListNode r3;
    	if(r1.value<r2.value){
    		r3=r1;
    		r3.next=merge(r1.next,r2);
    	}else{
    		r3=r2;
    		r3.next=merge(r1,r2.next);
    	}
    	return r3;
    }
}
