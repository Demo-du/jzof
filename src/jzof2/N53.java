package jzof2;

public class N53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N53 n53=new N53();
        int []num={1,2,3,3,3,3,4,5};
        int a=3;
        System.out.println(n53.getnum(num, a));
	}
    public int getnum(int []num,int a){
    	if(num==null||num.length==0){
    		return -1;
    	}
    	int dis;
    	dis=getlast(num,a,0,num.length-1)-getfirst(num,a,0,num.length-1)+1;
    	return dis;
    }
    public int getfirst(int []num,int a,int start,int end){
    	if(start>end){
    		return -1;
    	}
    	int mid=(start+end)/2;
    	int m_data=num[mid];
    	if(m_data==a){
    		if((mid>0&&num[mid-1]!=a)||mid==0){
    			return mid;
    		}else{
    			end=mid-1;
    		}
    	}else if(m_data>a){
              end=mid-1;
    	}else{
    		start=mid+1;
    	}
    	return getfirst(num,a,start,end);
    }
    public int getlast(int []num,int a,int start,int end){
    	if(start>end){
    		return -1;
    	}
    	int mid=(start+end)/2;
    	int m_data=num[mid];
    	if(m_data==a){
    		if((mid<num.length-1&&num[mid+1]!=a)||mid==num.length-1){
    			return mid;
    		}else{
    			start=mid+1;
    		}
    	}else if(m_data>a){
              end=mid-1;
    	}else{
    		start=mid+1;
    	}
    	return getlast(num,a,start,end);
    }
}
