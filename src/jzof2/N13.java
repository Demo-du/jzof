package jzof2;

public class N13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N13 n13=new N13();
        System.out.print(n13.movingCount(9,2,20));
	}
	public  int movingCount(int threshold,int rows,int cols){
		if(threshold<0||rows<0||cols<0){
			return 0;
		}
		boolean [][]visited=new boolean[rows][cols];
		for(int x=0;x<rows;x++){
			for(int y=0;y<cols;y++){
				visited[x][y]=false;
			}
		}
		int count=movingCountCore(threshold,rows,cols,0,0,visited);
		return count;
	}
	public int movingCountCore(int threshold,int rows,int cols,int x,int y,boolean [][]visited){
		int count=0;
		if(check(threshold,rows,cols,x,y,visited)){
			visited[x][y]=true;
			count=1+movingCountCore(threshold,rows,cols,x,y-1,visited)
					+movingCountCore(threshold,rows,cols,x,y+1,visited)
					+movingCountCore(threshold,rows,cols,x-1,y,visited)
					+movingCountCore(threshold,rows,cols,x+1,y+1,visited);
		}
		return count;
	}
	public boolean check(int threshold,int rows,int cols,int x,int y,boolean [][]visited){
		if(x>=0&&x<rows&&y>=0&&y<cols&&getDigitSum(x)+getDigitSum(y)<=threshold
				&&!visited[x][y]){
			return true;
		}
		return false;
	}
	public  int getDigitSum(int num){
		int sum=0;
		while(num>0){
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}
