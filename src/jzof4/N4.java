package jzof4;

public class N4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]nums= {
        		{1,2,8,9},
        		{2,4,9,12},
        		{4,7,10,13},
        		{6,8,11,15}
        };
        solve(nums,7);
	}
    public static void solve(int [][]nums,int target) {
    	int x=nums.length;
    	int y=nums[0].length;
    	int i=x-1;
    	int j=0;
    	while(i>=0&&i<x&&j>=0&&j<y) {
    		if(nums[i][j]>target) {
    			i--;
    		}else if(nums[i][j]<target) {
    			j++;
    		}else {
    			System.out.println(nums[i][j]);
    			break;
    		}
    	}
    }
}
