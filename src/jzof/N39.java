package jzof;

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
		if(nums==null||nums.length==0){
			return 0;
		}
		int choosen=nums[0];
		int times=1;
		for(int i=1;i<nums.length;i++){
			if(times==0){
				choosen=nums[i];
				times=1;
			}else if(nums[i]==choosen){
				times++;
			}else{
				times--;
			}
		}
		if(!CheckMoreThanHalf(nums,choosen)){
			return 0;
		}
		return choosen;
	}
	public boolean CheckMoreThanHalf(int []nums,int num){
		int times=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==num){
				times++;
			}
		}
		if(times*2<nums.length){
			return false;
		}
		return true;
	}

}
