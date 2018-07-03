package jzof4;

public class N11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums= {3,4,5,1,2};
        solve(nums,0,4);
	}
    public static void solve(int []nums,int s,int e) {
    	if(s==e) {
    		System.out.println(nums[s]);
    		return;
    	}
    	int mid=(s+e)/2;
    	if(nums[mid]>nums[nums.length-1]) {
    		if(nums[mid]>nums[mid+1]) {
    			System.out.println(nums[mid+1]);
    			return;
    		}else {
    			s=mid;
    		}
    		
    	}else if(nums[mid]<nums[nums.length-1]) {
    		if(nums[mid]<nums[mid-1]) {
    			System.out.println(nums[mid]);
    			return;
    		}else {
    			e=mid;
    		}
    	}else {
    		System.out.println(nums[mid]);
    		return;
    	}
    	solve(nums,s,e);
    }
}
