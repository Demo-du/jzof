package bishi.Netease2;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\8 0008.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int changduu=sc.nextInt();
            for (int i=0;i<changduu;i++) {
                int da = sc.nextInt();
                int you = sc.nextInt();
                if (you > da / 2)
                    System.out.println("0 " + (da - you));
                else
                    System.out.println("0 " + Math.max(0, you - 1));
            }
        }
    }
}
