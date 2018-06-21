package jzof2;

public class N45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N45 n45=new N45();
        int []nums= {3,32,321};
        n45.Print(nums);
	}
    public void Print(int []nums) {
    	if(nums==null||nums.length==0) {
    		return;
    	}
    	String res="";
    	String pre=null;
    	String now=null;
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			pre=nums[i]+""+nums[j];
    			now=nums[j]+""+nums[i];
    			if(pre.compareTo(now)>0) {
    				int tmp;
    				tmp=nums[i];
    				nums[i]=nums[j];
    				nums[j]=tmp;
    			}
    		}
    		res+=nums[i];
    	}
    	System.out.println(res);
    }
}
