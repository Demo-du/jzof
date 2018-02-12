package jzof;

public class N11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          int[] nums=new int []{3,4,5,1,2};
          System.out.println(min1(nums));
	}
	static int min1(int []nums) {
		int length=nums.length;
		if(length==0||nums==null){
			throw new RuntimeException("No more element.");
		}
		//定义两个指针
		int index1=0;
		int index2=length-1;
		int mid=0;//中间点
		while(nums[index1]>=nums[index2]){
			if(index2-index1==1){//找到临界点
				return nums[index2];
			}
			mid=(index1+index2)/2;
			if(nums[index1]==nums[index2]&&nums[mid]==nums[index2]&&nums[index1]==nums[mid]){
				return min2(nums,index1,index2);
			}
			if(nums[mid]>=nums[index1]){
				index1=mid;
			}else if(nums[mid]<=nums[index2]){
				index2=mid;
			}
		}
		return nums[mid];
	}
	static int min2(int []nums,int index1,int index2){//顺序查找
		int res=Integer.MAX_VALUE;
		for(int i=index1;i<=index2;i++){
			res=res<nums[i]?res:nums[i];
		}
		return res;
	}

}
