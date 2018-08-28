package bishi.haoweilai;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\28 0028.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int t=sc.nextInt();

            for(int i=0;i<t;i++){
                long x=sc.nextLong();
                Long k=sc.nextLong();
                int cnt=0;
                long y=1;
                long res=0;
                while (true){
                    if ((x+y)==(x|y)){
                        cnt++;
                    }
                    if(cnt>=k){
                        res=y;
                        break;
                    }else {
                        y++;
                    }
                }
                System.out.println(res);
            }
        }
    }
}
