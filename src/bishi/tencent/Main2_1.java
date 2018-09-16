package bishi.tencent;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\16 0016.
 */
public class Main2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [][]map=new int[n+1][n+1];
            for (int i=0;i<n+1;i++){
                for (int j=0;j<n+1;j++){
                    map[i][j]=65535;
                }
            }
            HashSet<Integer> []set=new HashSet[n+1];
            for (int i=1;i<n+1;i++){
                set[i]=new HashSet<Integer>();
            }
            for (int i=0;i<m;i++){
                map[sc.nextInt()][sc.nextInt()]=1;
               // map[i][1]=sc.nextInt();
                set[map[i][0]].add(map[i][1]);
            }
            int [][]zui=floyd(map,n+1);
            int []input=new int[n+1];
            int []out=new int[n+1];
            for (int i=1;i<n+1;i++){
                for (int j=1;j<n+1;j++){
                    if (map[i][j]<Integer.MAX_VALUE){
                        out[i]++;
                        input[j]++;
                    }
                }
            }
            int cnt=0;
            for (int i=1;i<n+1;i++){
                if (input[i]>out[i]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
    public static int[][] floyd(int[][] G,int n){
        int[][] Dis= new int[n][n];
        for(int q=0;q<n;q++){
            for(int w=0;w<n;w++){
                Dis[q][w]=G[q][w];
                //  Global.lujing[q][w]=Global.lujing[q][w]+String.valueOf(q)+" "+String.valueOf(w);
            }
        }

        for(int k = 0; k < n; k++){
            for(int i=0; i < n; i++ ){
                for(int j=0; j < n; j++){
                    if(Dis[i][j]>Dis[i][k]+Dis[k][j]){
                        Dis[i][j]=Dis[i][k]+Dis[k][j];
                    }
                }
            }
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                //if(k!=Global.I)
            }
        }
        return Dis;
    }
}
