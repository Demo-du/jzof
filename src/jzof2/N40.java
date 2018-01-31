package jzof2;

import java.util.TreeMap;

public class N40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums={3,4,5,1,2,8,9,7,6};
        N40 n40=new N40();
        n40.solve(nums, 7);
	}
	public void adjustMinHeap(int []nums,int pos,int len){
		int tmp;
		int child;
		for(tmp=nums[pos];2*pos+1<=len;pos=child){
			child=2*pos+1;
			if(child<len&&nums[child]<nums[child+1]){
				child++;
			}
			if(nums[child]>tmp){
				nums[pos]=nums[child];
			}else{
				break;
			}
		}
		nums[pos]=tmp;
	}
    public void solve(int []nums,int len){
    	int []heap=new int[len];
    	for(int i=0;i<len;i++){
    		heap[i]=nums[i];
    	}
    	for(int i=len/2-1;i>=0;i--){
    		adjustMinHeap(heap,i,len-1);
    	}

    	for(int i=len;i<nums.length;i++){
    		
    		if(nums[i]<heap[0]){
    			heap[0]=nums[i];
    			adjustMinHeap(heap,0,len-1);
    		}
    	}
    	for(int i=0;i<len;i++){
    		System.out.print(heap[i]+" ");
    	}
    }
}
