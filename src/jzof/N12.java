package jzof;

public class N12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char [][]mat={
				{'a','b','t','g'},	
				{'c','f','c','s'},
				{'j','d','e','h'}
		};
		String path="abtg";
		//System.out.println(mat.length);
        System.out.println(hasPath(mat,path));
	}
	public static boolean hasPath(char [][]mat,String path){
		if(mat==null||mat.length<=0||path==null){
			return false;
		}
		int rows=mat.length;//行数
		int cols=mat[0].length;//列数
		boolean [][]visited=new boolean[rows][cols]; 
		for(int x=0;x<rows;x++){
			for(int y=0;y<cols;y++){
				//System.out.print(mat[y][x]);
				visited[x][y]=false;
			}
		}
		int pathLength=0;
		for(int x=0;x<rows;x++){
			for(int y=0;y<cols;y++){
				//System.out.print(mat[y][x]);
				if(hasPathCore(mat, x,y,visited,path,pathLength)){
					return true;
				}
			}
		}
		return false;
	}
	public static boolean hasPathCore(char[][] mat,int x,int y,boolean[][] visited,String path,int pathLength){
	//(String path,char [][]mat,boolean [][]visited,int pathLength,int x,int y){
		boolean res=false;
		if (pathLength >= path.length())
			return true;
		if(x<0 || y<0 || x>=mat.length || y>=mat[0].length)
			return false;
		if(!visited[x][y] && mat[x][y]==path.charAt(pathLength)){
			pathLength++;
			
			visited[x][y]=true;
			res=hasPathCore(mat,x-1,y,visited,path,pathLength)
					||hasPathCore(mat,x+1,y,visited,path,pathLength)
					||hasPathCore(mat,x,y-1,visited,path,pathLength)
					||hasPathCore(mat,x,y+1,visited,path,pathLength);
           /* res=res1||res2||res3||res4;*/
			if(!res){
				--pathLength;
				visited[x][y]=false;
			}
		}
		return res;
	}

}
