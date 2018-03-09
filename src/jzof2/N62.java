package jzof2;

public class N62 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N62 n62=new N62();
        System.out.println(n62.last(5, 3));
	}
    public int last(int n,int m){
    	int []dp=new int [n+1];
    	dp[1]=0;
    	for(int i=2;i<n+1;i++){
    		dp[i]=(dp[i-1]+m)%i;
    	}
    	return dp[n];
    }
}
