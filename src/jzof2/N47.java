package jzof2;


public class N47 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int[][]{{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        N47 n47 =new N47();
        System.out.println(n47.maxvalue(arr));
	}
    public int maxvalue(int [][]map){
    	int m=map.length;
    	int n=map[0].length;
    	int [][]dp=new int [m][n];
    	dp[0][0]=map[0][0];
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    			int left=0;
				int up=0;
				if(i>0){
					up=dp[i-1][j];
				}
				if(j>0){
					left=dp[i][j-1];
				}
				dp[i][j]=Math.max(up, left)+map[i][j];
    		}
    	}
    	return dp[m-1][n-1];
    }
}
