package jzof;

public class N53_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // int []num=new int[]{-3,-1,1,3,5};
		int []num=new int[]{-6,-3,-1,1,3,5};
        N53_3 n53=new N53_3();
        int res=n53.getnum(num);
        System.out.println(res);
	}
    public int getnum(int []num){
    	if(num==null|num.length==0){
    		return -1;
    	}
    	return getnumcore(num,0,num.length-1);
    }
    public int getnumcore(int []num,int start,int end){
    	int mid=(start+end)/2;
    	if(mid>0&&num[mid]>mid){
    		end=mid-1;
    	}
    	if(mid<num.length-1&&num[mid]<mid){
    		start=mid+1;
    	}
    	if(mid==0||mid==num.length-1){
    		if(num[mid]==mid){
    			return mid;
    		}
    		return -1;
    	}
    	if(num[mid]==mid){
    		return mid;
    	}
    	int res=getnumcore(num,start,end);
    	return res;
    }
}
