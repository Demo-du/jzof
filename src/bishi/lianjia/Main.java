package bishi.lianjia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\18 0018.
 */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oo = sc.nextInt();
        int[] num = new int[oo];
        for(int i=0;i<oo;i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        int jieguo = 0;

        for(int i=1;i<oo;i++) {
            jieguo += num[i];
        }
        System.out.println(jieguo);
    }
}