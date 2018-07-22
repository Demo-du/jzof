package bishi.pdd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\7\22 0022.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int sum=0;
            String str=sc.nextLine().trim();
            String []temp=str.split(" ");
            int []res=new int[temp.length];
            for(int i=0;i<temp.length;i++){
                res[i]=Integer.parseInt(temp[i]);
                sum=sum+res[i];
            }
            System.out.println(sum%300==0?sum/300:sum/300+1);
        }
    }
}
