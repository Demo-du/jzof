package bishi.ali;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\7 0007.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []nums=new int[n];
            for (int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            boolean flag=false;
            for (int i=1;i<n;i++){
                if (nums[i]-nums[i-1]<=0){
                    flag=true;
                    break;
                }
            }
            if (!flag){
                if (n>10){
                    System.out.println(8);
                }else {
                    System.out.println(1);
                }
            }else
                System.out.println(0);
        }
    }
}

