package bishi.haoweilai;
import java.util.Scanner;

public class heh{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in

        );
        int num=in.nextInt();//面数
        int num1 = in.nextInt();//奖励个数
        double[] arr=new double[num];
        int count=0;
        double qiwang=0;

        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<num;i++){
            count+=arr[i];
        }
        for(int i=0;i<num;i++){
            qiwang+=(arr[i]*num1/num);
        }
        System.out.println(count/qiwang);
    }
}
