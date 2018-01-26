package jzof2;

public class N60 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N60 n60=new N60();
        n60.solve(3);
	}
    public void solve(int n){
    	int [][]dp=new int[n+1][n*6+1];
    	for(int i=1;i<=6;i++){
    		dp[1][i]=1;
    	}
    	for(int i=2;i<=n;i++){
    		for(int j=i;j<=6*i;j++){
    			for(int k=1;k<=j&&k<=6;k++){
    				dp[i][j]+=dp[i-1][j-k];
    			}
    		}
    	}
    	double total=Math.pow(6, n);
    	for(int i=n;i<=6*n;i++){
    		double ratio=(double)dp[n][i]/total;
    		System.out.println(i+"占比例："+ratio);
    	}
    }
}
