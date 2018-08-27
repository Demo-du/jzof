package bishi.sanliuling;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main4 {
    public static void main(String[] args) {
        Scanner shuru = new Scanner(System.in);
        while (shuru.hasNext()){
            int xx = shuru.nextInt();
            int li = shuru.nextInt();
            if(xx<1 || xx>2000 || li<1 || li>100){
                return;
            }
            int[] shuzu = new int[xx];
            for (int i = 0; i <xx ; i++) {
                shuzu[i] = shuru.nextInt();
            }
            int times = shuru.nextInt();
            int[] jieguo = new int[times];
            for (int i = 0; i < times; i++) {
                int l = shuru.nextInt();
                int r = shuru.nextInt();
                if (l>0 && r<=xx && l<=r){
                    Set<Integer> set = new HashSet<Integer>();
                    for (int j = l-1 ;j < r ; j++) {
                        set.add(shuzu[j]);
                    }
                    jieguo[i] = set.size();
                }
            }
            for (int i = 0; i <times ; i++) {
                System.out.println( jieguo[i]);
            }
        }
    }
}