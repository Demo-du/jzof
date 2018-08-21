package bishi.yj2;

import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] biao = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ECFAJKLBDGHIVWZYMNOPQRSTUX", "abcdefghijklmnopqrstuvwxyz", "erwqtyghbnuiopsjkdlfazxcvm"};
        while (sc.hasNextLine()) {
            String zifuc= sc.nextLine().trim();
            if(zifuc.equals("#")) break;
            String jieguo = "";
            int suoyin;
            for (int gg = 0; gg < zifuc.length(); gg ++ ) {
                if(zifuc.charAt(gg) >= 'A' && zifuc.charAt(gg) <= 'Z') {
                    suoyin = biao[0].indexOf(zifuc.charAt(gg));
                    jieguo += biao[1].charAt(suoyin);
                } else if(zifuc.charAt(gg) >= 'a' && zifuc.charAt(gg) <= 'z') {
                    suoyin = biao[2].indexOf(zifuc.charAt(gg));
                    jieguo += biao[3].charAt(suoyin);
                } else jieguo += zifuc.charAt(gg);
            }
            System.out.println(jieguo);
        }
    }
}