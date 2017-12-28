package jzof2;

public class N10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N10 n10=new N10();
        System.out.println(n10.Fibonacci(5));
	}
    public long Fibonacci(int n){
    	int []f=new int[n+1];
    	f[0]=0;
    	f[1]=1;
    	for(int i=2;i<=n;i++){
    		f[i]=f[i-1]+f[i-2];
    	}
    	return f[n];
    }
}
