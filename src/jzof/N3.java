package jzof;

import java.util.HashMap;

public class N3 {
	//问题1
     public static boolean search1(int nums[]) {
    	  int temp=0;
    	  if(nums.length==0||nums==null) {
    		  return false;
    	  }
    	  for(int i=0;i<nums.length;i++) {
    		  while(nums[i]!=i) {
    			  if(nums[i]==nums[nums[i]]) {
    				  return true;
    			  }
    			  temp=nums[i];
    			  nums[i]=nums[nums[i]];
    			  nums[temp]=temp;
    		  }
    	  }
    	  return false;
      }
     //问题2
     static int  getchongfu(int nums[]) {
    	 if(nums.length==0||nums==null) {
    		 return 0;
    	 }
    	 int start=1,end=nums.length-1;
    	 while(end>=start) {
    		 int mid=(end+start)/2;
    		 int count=countrange(nums,start,mid);
    		 if(end==start) {
    			 if(count>1) {
    				 return start;
    			 }else {
    				 break;
    			 }
    		 }
    		 if(count>(mid-start+1)) {//说明有重复数字
    			 end=mid;
    		 }else {
    			 start=mid+1;
    		 }
    	 }
    	 return -1;
     }
    static int countrange(int nums[],int start,int end) {//处在范围内的数字的数量
    	 if(nums.length==0||nums==null) {
    		 return 0;
    	 }
    	 int count=0;
    	 for(int i=0;i<nums.length;i++) {
    		 if(nums[i]>=start&&nums[i]<=end) {
    			 count++;
    		 }
    	 }
    	 return count;
     }
      public static void main(String []a){
    	  int []ss={2,3,1,4,2};
    	  System.out.print(getchongfu(ss));
            // print(ss);    	  
      }
}
