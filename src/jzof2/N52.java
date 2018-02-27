package jzof2;



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
		ListNode res=n52.findfist(n1, n4);
		System.out.println(res.value);
	}
    public ListNode findfist(ListNode r1,ListNode r2){
    	int len1=getlenth(r1);
    	int len2=getlenth(r2);
    	ListNode rlong;
    	ListNode rshort;
    	int dis=0;
    	if(len1>len2){
    		rlong=r1;
    		rshort=r2;
    		dis=len1-len2;
    	}else{
    		rlong=r2;
    		rshort=r1;
    		dis=len2-len1;
    	}
    	for(int i=0;i<dis;i++){
    		rlong=rlong.next;
    	}
    	while(rshort.value!=rlong.value){
    		rlong=rlong.next;
    		rshort=rshort.next;
    	}
    	return rshort;
    }
    public int getlenth(ListNode r1){
    	int len=0;
    	ListNode r=r1;
    	while(r!=null){
    		len++;
    		r=r.next;
    	}
    	return len;
    }
}
