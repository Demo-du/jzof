package bishi.toutiao;


import java.util.*;

public class Main2_1{
    static int[][] m = new int[1001][1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while(sc.hasNext()){
        Scanner shuru = new Scanner(System.in);
        int M = shuru.nextInt();
        int[][] shuzu = new int[M][M];
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                shuzu[i][j]=shuru.nextInt();
            }
        }
        System.out.println(numDistinctIslands(shuzu));
        //}
    }
    public static int numDistinctIslands(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] mark = new boolean[n][m];
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        Set<String> s = new HashSet<String>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!mark[i][j] && grid[i][j] == 1) {
                    int miny=j;

                    Queue<int[]> q = new LinkedList<int[]>();
                    q.add(new int[]{i, j});
                    mark[i][j] = true;
                    grid[i][j] = 0;
                    while(!q.isEmpty()) {
                        int[] t = q.remove();
                        int x=t[0], y = t[1];
                        for(int[] dir : dirs) {
                            int xx = x+dir[0], yy=y+dir[1];
                            if(xx<0||yy<0||xx>=n||yy>=m)	continue;
                            if(mark[xx][yy]||grid[xx][yy]==0)continue;
                            q.add(new int[]{xx, yy});
                            mark[xx][yy] = true;
                            grid[xx][yy] = 0;
                            miny = Math.min(miny, yy);
                        }
                    }

                    for(int ii=0; ii<n; ii++)
                        for(int jj=0; jj<m; jj++)
                            if(mark[ii][jj]) {
                                mark[ii][jj]  =false;
                                mark[ii-i][jj-miny] = true;
                            }

                    StringBuilder sb  = new StringBuilder();
                    for(int ii=0; ii<n; ii++)
                        for(int jj=0; jj<m; jj++) {
                            if(mark[ii][jj]) {
                                mark[ii][jj] = false;
                                sb.append(1);
                            } else {
                                sb.append(0);
                            }
                        }
                    s.add(sb.toString());
                }
            }
        }

        return s.size();
    }
}
