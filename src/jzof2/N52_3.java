package jzof2;

public class N52_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N52_3 n52=new N52_3();
		int []num={-3,-1,1,3,5};
		System.out.println(n52.getnum(num, 0, num.length-1));
	}
    public int getnum(int []num,int start,int end){
    	if(start>end){
    		return -1;
    	}
    	int mid=(start+end)/2;
    	if(num[mid]==mid){
    		return mid;
    	}else if(num[mid]>mid){
    		if(mid>0){
    			end=mid-1;
    		}else{
    			return -1;
    		}
    	}else{
    		if(mid<num.length){
    			start=mid+1;
    		}else{
    			return -1;
    		}
    	}
    	return getnum(num,start,end);
    }
}
