package jzof2;

import java.util.Scanner;

public class P57 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
        	nums[i]=sc.nextInt();
        }
        System.out.println(max(nums));
	}
    public static int max(int []nums){
    	/*int start=0;int end=0;
    	int res=0;
    	int vmax=0;
    	for(int i=0;i<nums.length;i++){
    		if(res<0){
    			res=nums[i];
    		}else{
    			res+=nums[i];
    		}
    		vmax=Math.max(vmax, res);
    	}*/
    	int []dp=new int[nums.length];
    	dp[0]=nums[0];
    	for(int i=1;i<nums.length;i++){
    		if(dp[i-1]>0){
    			dp[i]=dp[i-1]+nums[i];
    		}else{
    			dp[i]=nums[i];
    		}
    	}
    	return dp[nums.length-1];
    }
}
