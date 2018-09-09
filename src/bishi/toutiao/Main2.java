package bishi.toutiao;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/9/9 0009.
 */
public class Main2{
    public static void zhaoege(int[][] shuzu,int index1,int index2,int M){
        shuzu[index1][index2]=0;
        if(index1>0&&shuzu[index1-1][index2]==1){
            zhaoege(shuzu, index1 - 1, index2, M);
        }
        if(index2>0&&shuzu[index1][index2-1]==1){
            zhaoege(shuzu, index1, index2 - 1, M);
        }

        if(index1<M-1&&shuzu[index1+1][index2]==1){
            zhaoege(shuzu, index1 + 1, index2, M);
        }

        if(index2<M-1&&shuzu[index1][index2+1]==1){
            zhaoege(shuzu, index1, index2 + 1, M);
        }
    }
    public static void main(String args[]) {
        Scanner shuru = new Scanner(System.in);
        int M = shuru.nextInt();
        int[][] shuzu = new int[M][M];
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                shuzu[i][j]=shuru.nextInt();
            }
        }
        int shuliang=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                if(shuzu[i][j]==1){
                    zhaoege(shuzu, i, j,M);
                    shuliang++;
                }
            }
        }
        if (shuzu.length==0){
            shuliang=0;
        }
        if (shuzu.length==1&&shuzu[0][0]==1){
            shuliang=1;
        }
        if (shuzu.length==1&&shuzu[0][0]==0){
            shuliang=0;
        }
        System.out.print(shuliang);
    }
}