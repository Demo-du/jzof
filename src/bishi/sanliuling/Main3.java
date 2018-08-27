package bishi.sanliuling;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\27 0027.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []num1=new int [n];
            int []num2=new int[n];
            int []map1=new int [n];
            int []map2=new int[n];
            for(int i=0;i<n;i++){
                num1[i]=sc.nextInt();
                map1[num1[i]-1]=i;
            }
            for(int i=0;i<n;i++){
                num2[i]=sc.nextInt();
                map2[num2[i]-1]=i;
            }
            HashSet<Integer> set=new HashSet<>();
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    long dx=(map1[i])-(map1[j]);;//num1[i]-num1[j];//(map1[num1[i]-1])-(map1[num1[j]-1]);
                    long dy=(map2[i])-(map2[j]);//num2[i]-num2[j];//(map2[num2[i]-1])-(map2[num2[j]-1]);
                    long cheng=dx*dy;
                    if (cheng>=0){
                        set.add(i);
                        set.add(j);
                    }
                }
            }
            int res=n-set.size();
            System.out.println(res);
        }
    }
}
