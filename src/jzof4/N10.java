package jzof4;

public class N10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static void feibo(int n) {
    	int []dp=new int[n+1];
    	dp[0]=0;
    	dp[1]=1;
    	dp[2]=2;
    	for(int i=3;i<=n;i++) {
    		dp[i]=dp[i-1]+dp[i-2];
    	}
    	System.out.println(dp[n]);
    }
}
