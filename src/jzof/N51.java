package jzof;

public class N51 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []data=new int[]{7,5,6,4};
        N51 n51=new N51();
        System.out.println(n51.InversePairs(data));
	}
    public int InversePairs(int []data){
    	if(data==null||data.length==0){
    		return 0;
    	}
    	int []copy=new int[data.length];
    	for(int i=0;i<data.length;i++){
    		copy[i]=data[i];
    	}
    	int count=InversePairsCore(data,copy,0,data.length-1);
    	return count;
    }
    /*public int InversePairsCore(int[]data,int[]copy,int start,int end){
    	if(start==end){
    	//	System.out.println(start);
    		copy[start]=data[start];
    		return 0;
    	}
    	int mid=(start+end)/2;
    	int left=InversePairsCore(copy,data,start,mid);
    	int right=InversePairsCore(copy,data,mid+1,end);
    	int i=mid;
    	int j=end;
    	int indexcopy=end;
    	int count=0;
    	while(i>=start&&j>=mid+1){
    		if(data[i]>data[j]){
    			copy[indexcopy--]=data[i--];
    			count+=j-mid;
    		}else{
    			copy[indexcopy--]=data[j--];
    		}
    	}
    	for(;i>=start;i--){
    		copy[indexcopy--]=data[i];
    	}
    	for(;j>=mid+1;j--){
    		copy[indexcopy--]=data[j];
    	}
    	return left+right+count;
    }*/
    public int InversePairsCore(int[]data,int[]copy,int start,int end){
    	if(start==end){
    	//	System.out.println(start);
    		//copy[start]=data[start];
    		return 0;
    	}
    	int mid=(start+end)/2;
    	int left=InversePairsCore(copy,data,start,mid);
    	int right=InversePairsCore(copy,data,mid+1,end);
    	int i=mid;
    	int j=end;
    	int indexcopy=end;
    	int count=0;
    	while(i>=start&&j>=mid+1){
    		if(data[i]>data[j]){
    			copy[indexcopy--]=data[i--];
    			count+=j-mid;
    		}else{
    			copy[indexcopy--]=data[j--];
    		}
    	}
    	for(;i>=start;i--){
    		copy[indexcopy--]=data[i];
    	}
    	for(;j>=mid+1;j--){
    		copy[indexcopy--]=data[j];
    	}
    	return left+right+count;
    }
}
