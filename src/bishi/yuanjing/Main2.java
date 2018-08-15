package bishi.yuanjing;

import java.util.Scanner;

public class Main2 {
public static int zuidabufa(int [] nums ,int limit) {
    int [] dong =new int[limit];
    for (int i =0; i < limit; i++) {
        dong[i] = 1;
        for (int j = 0; j < i; j++) {
            if (nums[j] < nums[i]) {
                dong[i] = Math.max(dong[i], dong[j] + 1);
            }
        }
    }
    int zuidazhi =0;
    for (int i =0; i < dong.length; i++)
        if (dong[i]>zuidazhi) {
            zuidazhi = dong[i];
        }
            return zuidazhi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int daxiao = input.nextInt();
            int[] shuzu=new int[daxiao];
            for (int i =0; i < daxiao; i++)
                shuzu[i] = input.nextInt();
            System.out.println(zuidabufa(shuzu, daxiao));
        }}
}