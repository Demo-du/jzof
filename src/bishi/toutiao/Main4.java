package bishi.toutiao;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner shuru = new Scanner(System.in);
        int n = shuru.nextInt();
        int []shuzu=new int[n];
        for(int i=0;i<n;i++)
            shuzu[i]=shuru.nextInt();
        if(chazhao(shuzu))
            System.out.println(1);
        else
            System.out.println(0);
    }
    public static boolean chazhao(int[] nums) {
        int shuliang = 0;
        for (int shuzi : nums){
            if (shuliang == 0){
                if ((shuzi & 0x80) == 0){
                    shuliang = 0;
                }else if ((shuzi & 0xe0) == 0xc0){
                    shuliang = 1;
                }else if ((shuzi & 0xf0) == 0xe0){
                    shuliang = 2;
                }else if ((shuzi & 0xf8) == 0xf0){
                    shuliang = 3;
                }else {
                    return false;
                }
            }else {
                if ((shuzi & 0xc0) != 0x80) return false;
                shuliang --;
            }
        }
        return shuliang == 0;
    }
}
