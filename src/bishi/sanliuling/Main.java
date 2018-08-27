package bishi.sanliuling;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n<1 || n>2000 || m<1 || m>100){
                return;
            }
            int[] array = new int[n];
            for (int i = 0; i <n ; i++) {
                array[i] = sc.nextInt();
            }
            int times = sc.nextInt();
            int[] res = new int[times];
            for (int i = 0; i < times; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                if (l>0 && r<=n && l<=r){
                    Set set = new HashSet<Integer>();
                    for (int j = l-1 ;j < r ; j++) {
                        set.add(array[j]);
                    }
                    res[i] = set.size();
                }
            }
            for (int i = 0; i <times ; i++) {
                System.out.println( res[i]);
            }
        }
    }
}