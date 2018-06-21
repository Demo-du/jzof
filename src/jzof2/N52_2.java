package jzof2;

public class N52_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N52_2 n52=new N52_2();
		int []num={1,2,3,4,5,6,7};
		System.out.println(n52.getnum(num, 0, num.length-1));
	}
    public int getnum(int []num,int start,int end){
    	if(start>end){
    		return -1;
    	}
    	int mid=(start+end)/2;
    	int m_data=num[mid];
    	if(m_data==mid){
    		if(mid<num.length-1&&num[mid+1]!=mid+1){
    			//System.out.println(num[mid+1]);
    			return (mid+1);
    		}else{
    			start=mid+1;
    		}
    	}else{
    		if(mid>0&&num[mid-1]==mid-1){
    			return (mid);
    		}else if(mid==0){
    			return mid;
    		}else{
    			end=mid-1;
    		}
    	}
    	return getnum(num,start,end);
    }
}
