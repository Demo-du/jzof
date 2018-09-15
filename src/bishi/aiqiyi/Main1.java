package bishi.aiqiyi;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\15 0015.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String strstr=sc.nextLine().trim();
            char []str=strstr.toCharArray();
            if (getsum(str,true)==getsum(str,false)){
                System.out.println(0);
                continue;
            }
            int cha=getsum(str,true)-getsum(str,false);
            if (str[getzuida(str,true)]<str[getzuida(str,false)]){

            }
            if (cha>0&&cha<=9||cha<0&&cha>=-9){
                System.out.println(1);
                continue;
            }
            if (cha>0&&cha<=18||cha<0&&cha>=-18){
                System.out.println(2);
                continue;
            }
            System.out.println(3);
        }
    }
    public static int getsum(char []str,boolean qian){
        if (qian){
            return str[0]+str[1]+str[2]-3*'0';
        }else {
            return str[3]+str[4]+str[5]-3*'0';
        }
    }
    public static int getzuida(char []str,boolean qian){
        int index=0;
        int min=Integer.MAX_VALUE;
        if (qian){
            for (int i=0;i<3;i++){
                if(str[i]-'0'<min){
                    min=str[i]-'0';
                    index=i;
                }
            }
        }else {
            for (int i=3;i<6;i++){
                if(str[i]-'0'<min){
                    min=str[i]-'0';
                    index=i;
                }
            }
        }
        return index;
    }
   /* public static int solve(char []str,int cha,boolean qian){

    }*/
}
