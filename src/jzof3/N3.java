package jzof3;

import java.util.Scanner;

public class N3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums= {2,3,1,0,2,5,3};
        solve(nums);
	}
    public static void solve(int[]nums) {
    	int n=nums.length;
    	for(int i=0;i<n;i++) {
    		if(nums[i]==i) {
    			continue;
    		}else {
    			while(nums[i]!=i) {
    				if(nums[i]==nums[nums[i]]) {
        				System.out.println(nums[i]);
        				break;
        			}
    				swap(nums,i,nums[i]);
    			}
    			
    		}
    	}
    }
    public static void swap(int []nums,int i,int j) {
    	int tmp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=tmp;
    }
}
