package jzof2;

public class N16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N16 n16=new N16();
        System.out.println(n16.pow(2, 3));
	}
    public double pow(double base,int exp){
    	if(exp==0){
    		return 1;
    	}
    	if(exp==1){
    		return base;
    	}
    	double res=pow(base,exp>>1);
    	res=res*res;
    	if((exp&1)==1){
    		res*=base;
    	}
    	return res;
    }
}
