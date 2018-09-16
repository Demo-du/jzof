package bishi.tencent;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\16 0016.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] shuzu = new boolean[n + 1];

        for (int tt = 2; tt < shuzu.length; tt++) {
            if (!shuzu[tt]) {
                for (int j = 2 * tt; j < shuzu.length; j += tt) {
                    shuzu[j] = true;
                }
                int hhh=tt;
                list.add(hhh);
            }
        }
        int jieguo = 2;
        for (int jichu : list) {
            int zuida = 0;
            int tmp1 = jichu;
            while (tmp1 <= n) {
                zuida = Math.max(zuida, dedaofang(tmp1, jichu));
                tmp1 =tmp1+ jichu;
            }
            while (dedaofang(tmp1, jichu) < zuida) {
                tmp1 += jichu;
            }
            jieguo = Math.max(jieguo, tmp1);
        }
        System.out.println(jieguo);
    }



    private static int dedaofang(int chushu, int jichu) {
        int jieguo = 0;
        while (chushu % jichu == 0) {
            jieguo++;
            chushu /= jichu;
        }
        return jieguo;
    }


}


