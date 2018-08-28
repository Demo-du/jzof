package bishi.haoweilai;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\28 0028.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine().trim();
            String str2=sc.nextLine().trim();
            String str3=sc.nextLine().trim();
            String tmp=str1.replaceAll(str2,str3);
            System.out.println(tmp);
        }
    }
}
