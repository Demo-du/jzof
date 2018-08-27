package bishi.sanliuling;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\27 0027.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            long [][]map=new long[num][2];
            for (int i=0;i<num;i++){
                map[i][0]=sc.nextLong();
                map[i][1]=sc.nextLong();
            }
            long xleft=Long.MAX_VALUE;
            long xright=Long.MIN_VALUE;
            long yleft=Long.MAX_VALUE;
            long yright=Long.MIN_VALUE;
            for (int i=0;i<num;i++){
                if (xleft>map[i][0]){
                    xleft=map[i][0];
                }
                if(xright<map[i][0]){
                    xright=map[i][0];
                }
                if(yleft>map[i][1]){
                    yleft=map[i][1];
                }
                if (yright<map[i][1]){
                    yright=map[i][1];
                }
            }
            long max=(yright-yleft)>(xright-xleft)?(yright-yleft):(xright-xleft);
            System.out.println(max*max);
        }
    }
}
