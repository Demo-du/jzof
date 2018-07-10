package jzof4;

public class N14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int solve(int len) {
    	if(len<2) {
    		return 0;
    	}
    	if(len==2) {
    		return 1;
    	}
    	if(len==3) {
    		return 2;
    	}
    	int timesof3=len/3;
    	if(len-timesof3*3==1) {
    		timesof3-=1;
    	}
    	int timesof2=(len-timesof3*3)/2;
    	return (int)Math.pow(3, timesof3)*(int)(Math.pow(2, timesof2));
    	//return 0;
    }
}
