package jzof2;

import java.util.Arrays;

public class N61 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N61 n61 =new N61();
		int []nums={1,2,5,3,0};
		System.out.println(n61.IsCon(nums));
	}
    public boolean IsCon(int []nums){
    	if(nums.length<5||nums==null){
    		return false;
    	}
    	Arrays.sort(nums);
    	int num_zero=0;
    	int num_gap=0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==0){
    			num_zero++;
    		}
    	}
    	int index1=num_zero;
    	int index2=index1+1;
    	for(;index2<nums.length;index2++){
    		if(nums[index1]==nums[index2]){
    			return false;
    		}
    		num_gap+=nums[index2]-nums[index1]-1;
    		index1=index2;
    	}
    	return num_zero>=num_gap?true:false;
    }
}
