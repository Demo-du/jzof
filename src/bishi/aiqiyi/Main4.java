package bishi.aiqiyi;

import java.util.Scanner;
import java.util.Arrays;

public class Main4{
    public static void main(String[] args){
        Scanner shuru = new Scanner(System.in);
        while(shuru.hasNext()){
            String sifuchuan = shuru.nextLine().trim();
            int he = 0;
            int[] shuzu = new int[6];
            int jieguo = 0;
            int shuzi = 0;
            int[] nums2 = new int[6];
            for(int i = 0; i < 3; i++){
                shuzu[i] = Integer.valueOf(sifuchuan.charAt(i) + "");
                nums2[i] = 9 - Integer.valueOf(sifuchuan.charAt(i) + "");
                shuzi += shuzu[i];
            }
            for(int i = 3; i < 6; i++){
                shuzu[i] = Integer.valueOf(sifuchuan.charAt(i) + "");
                nums2[i] = 9 - Integer.valueOf(sifuchuan.charAt(i) + "");
                he += shuzu[i];
            }
            if(shuzi == he)
                jieguo = 0;
            else if(shuzi > he){
                int shushu1 = 0;
                int shushu2 = 0;
                int chaju = shuzi - he;
                int[] shuzu01 = new int[3];
                int[] shuzu02 = new int[3];
                for(int i = 0; i < 3; i++){
                    shuzu01[i] = shuzu[i];
                    shuzu02[i] = nums2[i+3];
                }
                Arrays.sort(shuzu01);
                Arrays.sort(shuzu02);
                if(shuzu01[2] >= chaju)
                    shushu1 = 1;
                else if(shuzu01[1] + shuzu01[2] < chaju)
                    shushu1 = 3;
                else
                    shushu1 = 2;
                if(shuzu02[2] >= chaju)
                    shushu2 = 1;
                else if(shuzu02[1] + shuzu02[2] < chaju)
                    shushu2 = 3;
                else
                    shushu2 = 2;
                jieguo = Math.min(shushu1, shushu2);
                if(jieguo == 3){
                    if(shuzu01[2]+shuzu02[2] >= chaju)
                        jieguo = 2;
                }
            }
            else{
                int shuliang1 = 0;
                int shuliang2 = 0;
                int cha = he - shuzi;
                int[] shuzu3 = new int[3];
                int[] shuzu4 = new int[3];
                for(int i = 0; i < 3; i++){
                    shuzu3[i] = shuzu[i+3];
                    shuzu4[i] = nums2[i];
                }
                Arrays.sort(shuzu4);
                Arrays.sort(shuzu3);
                if(shuzu3[2] >= cha)
                    shuliang1 = 1;
                else if(shuzu3[1] + shuzu3[2] < cha)
                    shuliang1 = 3;
                else
                    shuliang1 = 2;
                if(shuzu4[2] >= cha)
                    shuliang2 = 1;
                else if(shuzu4[1] + shuzu4[2] < cha)
                    shuliang2 = 3;
                else
                    shuliang2 = 2;
                jieguo = Math.min(shuliang1, shuliang2);
                if(jieguo == 3){
                    if(shuzu3[2]+shuzu4[2] >= cha)
                        jieguo = 2;
                }
            }

            System.out.println(jieguo);

        }
    }
}