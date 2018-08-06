package bishi.yinlian;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\2 0002.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine().trim();
            int zuhe=0;
            for(int i=1;i<str.length();i++){
                int tmp1=0;//xiaoshu
                int tmp2=0;//zhengshu
                int tmp3=0;
                int tmp4=0;
                String str2=str;
                String s1=str.substring(0,i);
                String s2=str2.substring(i,str2.length());
                if (s1.length()>1&&s1.charAt(0)=='0'){
                    tmp1=1;
                    tmp2=0;
                }else if (s1.length()==1){
                    tmp1=0;
                    tmp2=1;
                }else {
                     tmp2=s1.length()-1;
                }
                if(s1.length()>1&&s1.charAt(s1.length()-1)=='0'){
                    tmp1=0;
                }else if (s1.length()==1){
                    tmp1=0;
                }else if(s1.length()>1&&s1.charAt(0)!='0'){
                    tmp1=s1.length()-1;
                }else {
                    tmp1=1;
                }

                //
                if (s2.length()>1&&s2.charAt(0)=='0'){
                    tmp3=1;
                    tmp4=0;
                }else if (s2.length()==1){
                    tmp3=0;
                    tmp4=1;
                }else {
                    tmp4=s2.length()-1;
                }
                if(s2.length()>1&&s2.charAt(s2.length()-1)=='0'){
                    tmp3=0;
                }else if (s2.length()==1){
                    tmp3=0;
                }else if(s2.length()>1&&s2.charAt(0)!='0'){
                    tmp3=s2.length()-1;
                }else {
                    tmp3=1;
                }
                zuhe+=(tmp1+tmp2)*(tmp3+tmp4);
            }
            System.out.println(zuhe);
        }
    }
}
