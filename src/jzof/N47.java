package jzof;

public class N47 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]arr=new int[][]{{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        N47 n47 =new N47();
        System.out.println(n47.getMax(arr));
	}
	public int getMax(int [][]gift){
		if(gift==null){
			return 0;
		}
		int row=gift.length;
		int col=gift[0].length;
		int[][] maxvalue=new int[row][col];
		maxvalue[0][0]=gift[0][0];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				int left=0;
				int up=0;
				if(i>0){
					up=maxvalue[i-1][j];
				}
				if(j>0){
					left=maxvalue[i][j-1];
				}
				maxvalue[i][j]=Math.max(up, left)+gift[i][j];
			}
		}
		return maxvalue[row-1][col-1];
	}

}
