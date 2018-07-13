package jzof4;

public class N16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(pow(2,3));
	}
    public static double pow(int base,int n) {
    	double res=0;
    	if(n==0) {
    		res=1;
    		return res;
    	}
    	if(n==1) {
    		return base;
    	}
    	res=pow(base,n/2);
    	res=res*res;
    	if((n&1)==1) {
    		res=res*base;
    	}
    	return res;
    }
}
