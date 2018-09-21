package bishi.pdd3;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\21 0021.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int N=sc.nextInt();
            int []nums=new int[N];
            for (int i=0;i<N;i++){
                nums[i]=sc.nextInt();
            }
            if (N<8)
            System.out.println(nums[N/2]);
        }
    }
}
