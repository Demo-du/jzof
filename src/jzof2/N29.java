package jzof2;

import java.util.ArrayList;

public class N29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		N29 n29=new N29();
		System.out.println(n29.printMatrix(nums));
	}
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		if(matrix==null){
			return null;
		}
		ArrayList<Integer> res=new ArrayList<Integer>();
		res.clear();
		int col=matrix[0].length;
		int row=matrix.length;
		int start=0;
		while(col>start*2&&row>start*2){
			addp(res,matrix,start);
			start++;
		}
	    return res;
    }
	public void addp(ArrayList<Integer> res,int [][] matrix,int start){
		int endx=matrix[0].length-1-start;
		int endy=matrix.length-1-start;
		for(int i=start;i<=endx;i++){//从左到右
			res.add(matrix[start][i]);
		}
		if(start<endy){
			for(int i=start+1;i<=endy;i++){
				res.add(matrix[i][endx]);
			}
		}
		if(start<endx&&start<endy){
			for(int i=endx-1;i>=start;i--){
				res.add(matrix[endy][i]);
			}
		}
		if(start<endx&&start<endy-1){
			for(int i=endy-1;i>=start+1;i--){
				res.add(matrix[i][start]);
			}
		}
	}
}
