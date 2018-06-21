package jzof;

public class N15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(num(3));
	}
    public static int num(int n){
    	int count=0;
    	while(n!=0){
    		++count;
    		n=(n-1)&n;
    	}
    	return count;
    }
}
