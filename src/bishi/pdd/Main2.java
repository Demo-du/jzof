package bishi.pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\7\22 0022.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int N=sc.nextInt();
            int M=sc.nextInt();
            char [][] map=new char[M][N];
            if(N<=0||M<=0){
                System.out.println(-1);
                continue;
            }
            for(int i=0;i<M;i++){
                String str=sc.next();
                for(int j=0;j<N;j++){
                    map[i][j]+=str.charAt(j);
                }
            }
            long []so=new long[N];
            for(int i=0;i<N;i++){
                for (int j=0;j<M;j++){
                    so[i]+=map[j][i];
                }
            }
            //Arrays.sort(so);
            if(so.length==0){
                System.out.println(-1);
            }else if(so.length==1){
                System.out.println(0);
            }else{
                long min=Long.MAX_VALUE;
                long index=-1;
                for(int i=0;i<so.length;i++){
                    if(so[i]<min){
                        min=so[i];
                        index=i;
                    }
                }
                int cnt=0;
                for(int i=0;i<so.length;i++){
                    if(so[i]==min){
                        cnt++;
                    }
                }
                if(cnt>1){
                    System.out.println(-1);
                }else{
                    System.out.println(index);
                }
            }
        }
    }
}
