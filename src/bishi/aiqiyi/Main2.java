package bishi.aiqiyi;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\15 0015.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int P=sc.nextInt()-1;
            int []A=new int[N];
            for (int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            for (int i=0;i<M;i++){
                String c=sc.next().trim();
                if (c.charAt(0)=='A'){
                    int index=sc.nextInt()-1;
                    A[index]++;
                }else {
                    int index=sc.nextInt()-1;
                    A[index]--;
                }
            }
            int pai=1;
            for (int i=0;i<N;i++){
                if (i==P){
                    continue;
                }
                if (A[i]>A[P]){
                    pai++;
                }
            }
            System.out.println(pai);
        }
    }
}
