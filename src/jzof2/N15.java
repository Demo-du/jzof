package jzof2;

public class N15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N15 n15=new N15();
        System.out.println(n15.numof(3));
	}
    public int numof(int n){
    	int cnt=0;
    	while(n>0){
    		cnt++;
    		n=(n-1)&n;
    	}
    	return cnt;
    }
}
