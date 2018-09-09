package bishi.toutiao;

import java.util.Scanner;

import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner shuru=new Scanner(System.in);
        String zifuchuan=shuru.nextLine();
        System.out.println(jiejue(zifuchuan).size());
    }
    public static List<String> jiejue(String zifuchuan) {
        List<String> jieguo = new ArrayList<String>();
        int changdu = zifuchuan.length();
        for(int i = 1; i<4 && i<changdu-2; i++){
            for(int j = i+1; j<i+4 && j<changdu-1; j++){
                for(int k = j+1; k<j+4 && k<changdu; k++){
                    String str = zifuchuan.substring(0,i), str2 = zifuchuan.substring(i,j), str3 = zifuchuan.substring(j,k), str4 = zifuchuan.substring(k,changdu);
                    if(youxiaofou(str) && youxiaofou(str2) && youxiaofou(str3) && youxiaofou(str4)){
                        jieguo.add(str+"."+str2+"."+str3+"."+str4);
                    }
                }
            }
        }
        return jieguo;
    }
    public static boolean youxiaofou(String zifuchuan){
        if(zifuchuan.length()>3 || zifuchuan.length()==0 || (zifuchuan.charAt(0)=='0' && zifuchuan.length()>1) || Integer.parseInt(zifuchuan)>255)
            return false;
        return true;
    }
}
