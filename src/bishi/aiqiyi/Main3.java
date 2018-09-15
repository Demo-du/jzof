package bishi.aiqiyi;

import java.util.Scanner;

import java.util.Arrays;

public class Main3{
    public static void main(String[] args){
        Scanner shuru = new Scanner(System.in);
        while(shuru.hasNext()){
            String zifuchuan = shuru.nextLine().trim();
            int[] shuzu1 = new int[6];
            int[] shuzu2 = new int[6];
            int shuzi = 0;
            int shuzi1 = 0;
            int jieguo;
            for(int i = 0; i < 3; i++){
                shuzu1[i] = Integer.valueOf(zifuchuan.charAt(i) + "");
                shuzu2[i] = 9 - Integer.valueOf(zifuchuan.charAt(i) + "");
                shuzi += shuzu1[i];
            }
            for(int i = 3; i < 6; i++){
                shuzu1[i] = Integer.valueOf(zifuchuan.charAt(i) + "");
                shuzu2[i] = 9 - Integer.valueOf(zifuchuan.charAt(i) + "");
                shuzi1 += shuzu1[i];
            }
            if(shuzi == shuzi1)
                jieguo = 0;
            else if(shuzi > shuzi1){
                int dif = shuzi - shuzi1;
                int ccc1 = 0;
                int ccc2 = 0;
                int[] arr1 = new int[3];
                int[] arr2 = new int[3];
                for(int i = 0; i < 3; i++){
                    arr1[i] = shuzu1[i];
                    arr2[i] = shuzu2[i+3];
                }
                Arrays.sort(arr2);
                Arrays.sort(arr1);
                if(arr1[2] >= dif)
                    ccc1 = 1;
                else if(arr1[1] + arr1[2] >= dif)
                    ccc1 = 2;
                else
                    ccc1 = 3;
                if(arr2[2] >= dif)
                    ccc2 = 1;
                else if(arr2[1] + arr2[2] >= dif)
                    ccc2 = 2;
                else
                    ccc2 = 3;
                jieguo = Math.min(ccc1, ccc2);
            }
            else{
                int shu1 = 0;
                int shu2 = 0;
                int chaju = shuzi1 - shuzi;
                int[] shuzu01 = new int[3];
                int[] shuzu02 = new int[3];
                for(int i = 0; i < 3; i++){
                    shuzu01[i] = shuzu1[i+3];
                    shuzu02[i] = shuzu2[i];
                }
                Arrays.sort(shuzu01);
                Arrays.sort(shuzu02);
                if(shuzu01[2] >= chaju)
                    shu1 = 1;
                else if(shuzu01[1] + shuzu01[2] >= chaju)
                    shu1 = 2;
                else
                    shu1 = 3;
                if(shuzu02[2] >= chaju)
                    shu2 = 1;
                else if(shuzu02[1] + shuzu02[2] >= chaju)
                    shu2 = 2;
                else
                    shu2 = 3;
                jieguo = Math.min(shu1, shu2);
            }
            System.out.println(jieguo);

        }
    }
}