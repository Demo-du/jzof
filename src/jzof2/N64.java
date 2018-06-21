package jzof2;


public class N64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N64 n64=new N64();
        System.out.println(n64.getsum(2));
	}
    public int getsum(int n){
    	int t=0;
    	boolean bool=(n>0&&(t=n+getsum(n-1))>0);
    	return t;
    }
}
