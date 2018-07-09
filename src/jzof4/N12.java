package jzof4;

public class N12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char [][]map= {
        		{'a','b','t','g'},
        		{'c','f','c','s'},
        		{'j','d','e','h'}
        };
        boolean [][]visited=new boolean[3][4];
        solve(map,0,0,"abfd",visited,0);
	}
    public static boolean solve(char [][]map,int x,int y,String s,boolean[][]visited,int len) {
    	boolean res=false;
    	int hang=map.length;
    	int lie=map[0].length;
    	if(x<0||x>hang-1||y<0||y>lie-1) {
    		return false;
    	}
    	if(len>=4) {
    		System.out.println("sss");
    		return true;
    	}
    	if(map[x][y]==s.charAt(len)) {
    		len++;
    		visited[x][y]=true;
    	}else {
    		return false;
    	}
    	res=solve(map,x+1,y,s,visited,len)||
    			solve(map,x,y+1,s,visited,len)||
    			solve(map,x-1,y,s,visited,len)||
    			solve(map,x,y-1,s,visited,len);
    	if(!res) {
    		visited[x][y]=false;
    	}
    	return res;
    }
}
