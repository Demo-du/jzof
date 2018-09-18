package bishi.didi;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\18 0018.
 */
public class Main2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int np=sc.nextInt();
            int nq=sc.nextInt();
            int nr=sc.nextInt();
            int []ap={np};
            int []aq={nq};
            int []ar={nr};
            int []num={0};
            int len=np+nq+nr;
            char []tmp=new char[len];
            if (len==0){
                System.out.println(0);
                continue;
            }
            int res=(int)Math.pow(2,ap[0])+(int)Math.pow(2,aq[0])+(int)Math.pow(2,ar[0])-ap[0]*aq[0]*ar[0];
            System.out.println(res);
        }
    }

}
