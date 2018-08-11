package bishi.Netease;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] shuru = new int[n];
        for (int tt = 0;tt < n;tt++){
            shuru[tt] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] shuchu = new int[m];
        for (int i = 0;i < m;i++){
            shuchu[i] = sc.nextInt();
        }
        int[] proxy = new int[n+1];
        proxy[0] = 0;
        for(int i =  1;i <= n;i++){
            proxy[i] = shuru[i-1] + proxy[i-1];
        }

        for(int i = 0;i < m;i++){
            int jieguo = Arrays.binarySearch(proxy, shuchu[i]);
            if(jieguo < 0){
                jieguo = -(jieguo+2);
                shuchu[i] = jieguo + 1;
            }else{
                shuchu[i] = jieguo;
            }
            System.out.println(shuchu[i]);

        }

    }
}