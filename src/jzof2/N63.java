package jzof2;

public class N63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums={9,11,8,5,7,12,16,14};
        System.out.println(new N63().maxdif(nums));
	}
    public int maxdif(int []nums){
    	if(nums==null||nums.length==0){
    		return -1;
    	}
    	int index1=0;
    	int max=0;
    	for(int i=1;i<nums.length;i++){
    		int tmp=nums[i]-nums[index1];
    		if(tmp>max){
    			max=tmp;
    		}
    		if(nums[i]<nums[index1]){
    			index1=i;
    		}
    	}
    	return max;
    }
}
