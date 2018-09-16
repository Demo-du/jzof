package bishi.tencent;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\16 0016.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner shuru=new Scanner(System.in);
        while (shuru.hasNext()){
            int shuliang=shuru.nextInt();
            for (int io=0;io<shuliang;io++){
                int A=shuru.nextInt();
                int B=shuru.nextInt();
                int C=shuru.nextInt();
                int zonghe=A;
                for (int i=0;i<B;i++){
                    if (zonghe%B==C){
                        System.out.println("YES");
                        break;
                    }
                    zonghe+=A;
                    if (i==B-1){
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
