package jzof2;


public class N42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N42 n42=new N42();
        int [] arr=new int[]{1,-2,3,10,-4,7,2,-5};
        System.out.println(n42.findmaxsum(arr));
	}
    public int findmaxsum(int []nums){
    	int []dp=new int[nums.length];
    	dp[0]=nums[0];
    	int max=0;
    	for(int i=1;i<nums.length;i++){
    		if(dp[i-1]>0){
    			dp[i]=dp[i-1]+nums[i];
    			max=Math.max(max, dp[i]);
    		}else{
    			dp[i]=nums[i];
    			max=Math.max(max, dp[i]);
    		}
    	}
    	return max;
    }
}
