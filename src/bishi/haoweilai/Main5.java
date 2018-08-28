package bishi.haoweilai;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\28 0028.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int []nums=new int[n];
            if (n==1){
                System.out.println(nums[0]);
                continue;
            }else {

            }
            for (int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int s=0;
            int e=n-1;
            for (int i=0;i<n-1;i++){
                if(nums[i]<nums[i+1]){
                    s=i;
                    break;
                }
            }
            for (int i=n-1;i>0;i--){
                if(nums[i]>nums[i-1]){
                    e=i;
                    break;
                }
            }
            int he=0;
            for (int i=0;i<n;i++){
                he+=nums[i];
            }
            System.out.println(he);
        }
    }
}
