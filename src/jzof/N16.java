package jzof;

public class N16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,6));

	}
    static double power(double base,int exp){
    	if(exp==0){
    		return 1;
    	}
    	if(exp==1){
    		return base;
    	}
    	double res=power(base,exp>>1);
    	res*=res;
    	if((exp&0x1)==1){
    		res*=base;
    	}
    	return res;
    }
}
