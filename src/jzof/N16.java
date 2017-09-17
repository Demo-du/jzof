package jzof;

public class N16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,3));

	}
    static double power(double base,int exp){
    	if(base==0){
    		return 1;
    	}
    	if(base==1){
    		return base;
    	}
    	double res=power(base,exp>>2);
    	res*=res;
    	if((exp&0x1)==1){
    		res*=base;
    	}
    	return res;
    }
}
