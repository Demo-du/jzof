package bishi.pdd3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\21 0021.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int M=sc.nextInt();
            int A=sc.nextInt();
            int R=sc.nextInt();
            double res=(double)(R-(M-A)+1)/(double)R;
          //  DecimalFormat df = new DecimalFormat("#.00000");
            String str = String.format("%.5f", res);
            System.out.println(str);
        }
    }
}
