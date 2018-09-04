package bishi.ctrp;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\4 0004.
 */
public class Main2 {
    public static void main(String[] args) {
            int arr[]=new int[10];
            for (int i=0;i<arr.length;i++){
                arr[i]=(int)(Math.random()*10)+1;
            }
            MergeSort(arr,0,arr.length-1);
            for (int i=arr.length-1;i>=0;i--){
                System.out.println(arr[i]);
            }
    }
    public static void MergeSort(int[]a,int p,int r) {
        int index1=p,index2=r;
        int biaozhun=a[p];
        if(p>=r) {
            return ;
        }
        while(index1<index2) {
            while(index1<index2&&a[index2]>=biaozhun) {
                index2--;
            }
            if(index1<index2) {
                a[index1++]=a[index2];
            }
            while(index1<index2&&a[index1]<biaozhun) {
                index1++;
            }
            if(index1<index2) {
                a[index2--]=a[index1];
            }
        }
        a[index1]=biaozhun;
        MergeSort(a, p, index1 - 1);
        MergeSort(a,index1+1,r);
    }
}
