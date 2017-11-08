package jzof;

public class N53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []data=new int[]{1,2,3,3,3,3,4,5};
        N53 n53=new N53();
        System.out.println(n53.getnum(data, 3));
	}
    public int getfirst(int []data,int k,int start,int end){
    	if(start>end){
    		return -1;
    	}
    	int mid_index=(start+end)/2;
    	int mid_data=data[mid_index];
    	if(mid_data==k){
    		if((mid_index>0&&data[mid_index-1]!=k)||mid_index==0){
    			return mid_index;
    		}else{
    			end=mid_index-1;
    		}
    	}else if(mid_data>k){
    		end=mid_index-1;
    	}else{
    		start=mid_index+1;
    	}
    	return getfirst(data,k,start,end);
    }
    public int getlast(int []data,int k,int start,int end){
    	if(start>end){
    		return -1;
    	}
    	int mid_index=(start+end)/2;
    	int mid_data=data[mid_index];
    	if(mid_data==k){
    		if((mid_index<data.length-1&&data[mid_index+1]!=k)||mid_index==data.length-1){
    			return mid_index;
    		}else{
    			start=mid_index+1;
    		}
    	}else if(mid_data<k){
    		start=mid_index+1;
    	}else{
    		end=mid_index-1;
    	}
    	return getlast(data,k,start,end);
    }
    public int getnum(int []data,int k){
    	int num=0;
    	if(data==null||data.length==0){
    		return -1;
    	}
    	int first=getfirst(data,k,0,data.length-1);
    	//System.out.println("a");
    	int last=getlast(data,k,0,data.length-1);
    	//System.out.println("b");
    	if(first>-1&&last>-1){
    		num=last-first+1;
    	}
    	return num;
    }
}
