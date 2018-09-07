package bishi.ali;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\7 0007.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []nums=new int[n];
            for (int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            boolean flag=false;
            int len=1;
            int cnt=0;
            int cha=nums[1]-nums[0];
            /*for (int i=2;i<n;i++){
                if (nums[i]-nums[i-1]!=cha){
                    len=1;
                    if (i<n-1){
                        cha=nums[i+1]-nums[i];
                    }
                }else {
                    len++;
                    if(len>=3){
                        cnt++;
                    }
                }
            }*/
            int index1=1;int index2=2;
            while(index1<index2&&index2<n){
                if (nums[index2]-nums[index1]!=cha){
                    index1=index2;
                    index2++;
                }else {
                    len++;
                    if(len>=3){
                        cnt++;
                    }
                    index2++;
                }
            }
            System.out.println(cnt);
            /*if (!flag){
                System.out.println(n/3+1);
            }else
            System.out.println(0);*/
        }
    }
}
