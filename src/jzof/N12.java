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
		int rows=mat.length;//长
		int cols=mat[0].length;//高
		boolean [][]visited=new boolean[rows][cols]; 
		int pathLength=0;
		for(int y=0;y<rows;y++){
			for(int x=0;x<cols;x++){
				//System.out.print(mat[y][x]);
				if(hasPathCore(path, mat,visited,pathLength,y,x)){
					return true;
				}
			}
		}
		return false;
	}
	public static boolean hasPathCore(String path,char [][]mat,boolean [][]visited,int pathLength,int x,int y){
		boolean res=false;
		if (pathLength >= path.length())
			return true;
		if(x>=0&&x<mat[0].length&&y>=0&&y<mat.length){
			if(x>0)
			System.out.println(mat[x-1][y]);
			if(!(mat[x][y]==path.charAt(pathLength)&&!visited[x][y])){
				return false;
			}
			pathLength++;
			
			visited[x][y]=true;
			boolean res1=false;
			boolean res2=false;
			boolean res3=false;
			boolean res4=false;
			
          /*  res1=x<=0?false:hasPathCore(path, mat,visited,pathLength,x-1,y);
            res2=x>=mat[0].length?false:hasPathCore(path, mat,visited,pathLength,x+1,y);
            res3=y<=0?false:hasPathCore(path, mat,visited,pathLength,x,y-1);
            res4=y>=mat.length?false:hasPathCore(path, mat,visited,pathLength,x,y+1);*/
           //.out.println(x+" "+y);
          //  System.out.println(res1+" "+res2+" "+res3+" "+res4);
			res=hasPathCore(path, mat,visited,pathLength,x-1,y)
					||hasPathCore(path, mat,visited,pathLength,x+1,y)
					||hasPathCore(path, mat,visited,pathLength,x,y-1)
					||hasPathCore(path, mat,visited,pathLength,x,y+1);
           /* res=res1||res2||res3||res4;*/
			if(!res){
				--pathLength;
				visited[x][y]=false;
			}
		}
		return res;
	}

}
