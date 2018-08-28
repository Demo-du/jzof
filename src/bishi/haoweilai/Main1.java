package bishi.haoweilai;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\28 0028.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next().trim();
            int cnt=0;
            String numstr="";
            for(int i=0;i<str.length();i++){
                numstr+=str.charAt(i);
                if (isc(numstr)){
                    cnt++;
                    numstr="";
                    continue;
                }
            }
            System.out.println(cnt);
        }
    }
    static boolean isc(String str){
        int res=0;
        for(int i=0;i<str.length();i++){
            res+=str.charAt(i)-'0';
        }
        if(res%3==0){
            return true;
        }else {
            return false;
        }
    }
}
