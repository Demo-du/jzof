package jzof2;

public class N14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N14 n14=new N14();
        System.out.println(n14.maxsolve(8));
	}
    public int maxsolve(int len){
    	if(len<2){
    		return 0;
    	}
    	if(len==2){
    		return 1;
    	}
    	if(len==3){
    		return 2;
    	}
    	int cut3=len/3;
    	if(len-cut3*3==1){
    		cut3--;
    	}
    	int cut2=(len-cut3*3)/2;
    	return (int)(Math.pow(3, cut3)*Math.pow(2,cut2));
    }
}
