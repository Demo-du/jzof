package bishi.beike2;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\3 0003.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            int M=sc.nextInt();
            if(N>=M){
                System.out.println(N-M);
            }else {
                int cha=M-N;
                int cha2=(M+1)/2;
                //xianx
                int cnt=0;
                int Ntmp=N;
                int Mtmp=M;
                while(Mtmp>Ntmp){
                    Ntmp*=2;
                    cnt++;
                }
                while(Ntmp>Mtmp){
                    Ntmp--;
                    cnt++;
                }
                //xianjian
                int cnt2=0;
                Ntmp=N;
                Mtmp=M;
                if (Ntmp<cha2){
                    System.out.println(cnt);
                    continue;
                }
                while (Ntmp>cha2){
                    Ntmp--;
                    cnt2++;
                }
                Ntmp*=2;
                cnt2++;
                while (Ntmp>Mtmp){
                    Ntmp--;
                    cnt2++;
                }
                System.out.println(Math.min(cnt,cnt2));
            }
        }
    }
}
