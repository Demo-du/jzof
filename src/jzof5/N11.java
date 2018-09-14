package jzof5;

/**
 * Created by Administrator on 2018\9\14 0014.
 */
public class N11 {
    public static void main(String[] args) {
        char [][]map={
                {'a','b','t','g'},
                {'c','f','c','s'},
                {'j','d','e','h'}
        };
        String str="abfb";
        solve(map,str);
    }
    public static void solve(char [][]map,String str){
        int len=0;
        boolean [][]visited=new boolean[map.length][map[0].length];
        for (int x=0;x<map.length;x++){
            for (int y=0;y<map[0].length;y++){
                if (ishan(map,str,x,y,len,visited)){
                    System.out.println("===============");
                    break;
                }
            }
        }
    }
    public static boolean ishan(char [][]map,String str,int x,int y,int len,boolean [][]visited){
        if (x<0||y<0||x>map.length||y>map[0].length){
            return false;
        }
        if (len>=str.length()){
            return true;
        }
        if (map[x][y]==str.charAt(len)&&!visited[x][y]){
            len++;
            visited[x][y]=true;
        }else {
            return false;
        }
        boolean res=ishan(map,str,x+1,y,len,visited)||
                ishan(map,str,x-1,y,len,visited)||
                ishan(map,str,x,y+1,len,visited)||
                ishan(map,str,x,y-1,len,visited);
        if (!res){
            visited[x][y]=false;
        }
        return res;
    }
}
