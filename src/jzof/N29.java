package jzof;

public class N29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintD(nums,4,4);
	}
	public static void PrintD(int [][]nums,int cols,int rows){
		if(nums==null){
			return;
		}
		int start=0;
		while(cols>start*2&&rows>start*2){
			PrintOne(nums,cols,rows,start);
			start++;
		}
	}
	public static void PrintOne(int [][]nums,int cols,int rows,int start){
		int endx=cols-1-start;
		int endy=rows-1-start;
		for(int i=start;i<=endx;i++){
			System.out.print(nums[start][i]);
		}
		if(start<endy){
			for(int i=start+1;i<endy;i++){
				System.out.print(nums[i][endx]);
			}
		}
		if(start<endx&&start<endy){
			for(int i=endx-1;i>=start;i--){
				System.out.print(nums[endy][i]);
			}
		}
		if(start<endx&&start<endy-1){
			for(int i=endy-1;i>=start+1;i--){
				System.out.print(nums[i][start]);
			}
			
		}
	}

}
