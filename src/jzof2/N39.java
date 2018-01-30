package jzof2;
public class N39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums=new int []{1,2,3,2,2,2,5,4,2};
        N39 nn=new N39();
        System.out.println(nn.MoreThanHalfNum(nums));
	}
    public int MoreThanHalfNum(int []nums){
    	int tmp=nums[0];
    	int times=1;
    	for(int i=1;i<nums.length;i++){
    		if(times==0){
    			tmp=nums[i];
    			times=1;
    		}else if(nums[i]==tmp){
    			times++;
    		}else{
    			times--;
    		}
    	}
    	return tmp;
    }
}
