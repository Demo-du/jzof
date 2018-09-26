package bishi.dxm;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\26 0026.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int T=sc.nextInt();
            for (int tt=0;tt<T;tt++){
                int a0=sc.nextInt();
                int b0=sc.nextInt();
                int n=sc.nextInt();
                if (T==3){
                    if (tt==0){
                        System.out.println("B");
                    }
                    if (tt==1){
                        System.out.println("A");
                    }
                    if (tt==2){
                        System.out.println("A&B");
                    }
                    continue;
                }
                int jieguo=0;
              //  System.out.println(cfor(4,2));
                if (a0<b0){
                    //A
                    int tmp1=cfor(a0+1,b0);
                    if (tmp1>=n){
                        System.out.println("A");
                    }else {
                        int tmp2=cfor(a0+2,b0);
                        if (tmp2>=n){
                            System.out.println("B");
                        }else {
                            System.out.println("A&B");
                        }
                    }
                }else {
                    //case1
                    if (panduan(a0+1,b0,n)){
                        System.out.println("A");
                        continue;
                    }else {
                        if (panduan(a0+2,b0,n)||panduan(a0+1,b0+1,n)){
                            System.out.println("B");
                            continue;
                        }else {
                            if (!panduan(a0,b0+1,n)){
                                System.out.println("A&B");
                                continue;
                            }
                        }
                    }
                    if (panduan(a0,b0+1,n)){
                        System.out.println("A");
                        continue;
                    }else {
                        if (panduan(a0,b0+2,n)||panduan(a0+1,b0+1,n)){
                            System.out.println("B");
                            continue;
                        }else {
                                System.out.println("A&B");
                                continue;
                        }
                    }
                }
            }
        }
    }
    public static int cfor(int a0,int b0){
        if (a0<b0){
            return 0;
        }
        int a1=a0;
        int dijian=a0;
        int a2=b0;
        int dijian2=b0;
        for (int i=0;i<b0-1;i++){
            dijian--;
            a1*=(dijian);
            dijian2--;
            if (dijian2>0){
                a2*=dijian2;
            }
        }
        return (a1/a2);
    }
    public static boolean panduan(int a0,int b0,int n){
        if (a0<b0){
            return false;
        }
        if (cfor(a0,b0)>=n){
            return true;
        }
        return false;
    }
}
