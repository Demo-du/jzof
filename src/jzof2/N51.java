package jzof2;

import java.util.Arrays;

public class N51 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N51 n51=new N51();
        int []data={7,5,6,4};
        System.out.println(n51.solve(data));
	}
    public int solve(int []data){
    	if(data==null||data.length==0){
    		return 0;
    	}
    	int []copy=new int[data.length];
    	for(int i=0;i<data.length;i++){
    		copy[i]=data[i];
    	}
    	int cnt=solve(data,copy,0,data.length-1);
    	return cnt;
    }
    public int solve(int[]data,int[]copy,int start,int end){
    	if(start==end){
    		copy[start]=data[end];
    		return 0;
    	}
    	int mid=(start+end)/2;
    	int left=solve(copy,data,0,mid);
    	int right=solve(copy,data,mid+1,end);
    	int i=mid;
    	int j=end;
    	int index=end;
    	int cnt=0;
    	while(i>=start&&j>=mid+1){
    		if(data[i]>data[j]){
    			copy[index--]=data[i--];
    			cnt+=j-mid;
    		}else{
    			copy[index--]=data[j--];
    		}
    	}
    	for(;i>=start;i--){
    		copy[index--]=data[i];
    	}
    	for(;j>=mid+1;j--){
    		copy[index--]=data[j];
    	}
    	return left+right+cnt;
    }
}
