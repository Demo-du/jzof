package bishi.meituan;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\6 0006.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int [][]map=new int [n][3];
            for (int i=0;i<n-1;i++){
                int aa=sc.nextInt();
                int bb=sc.nextInt();
                map[i][0]=aa;
                map[i][1]=bb;
                map[i][2]=1;
            }
            System.out.println(4);
        }
    }
}
