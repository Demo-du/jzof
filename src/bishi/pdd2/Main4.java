package bishi.pdd2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zifu1 = sc.nextLine();
        String[] zifu2 = zifu1.split(" ");
        int hehe = Integer.valueOf(zifu2[0]);
        int l = Integer.valueOf(zifu2[1]);
        String[] hang = new String[hehe];
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < hehe; i++) {
            String hang2 = sc.nextLine();
            set.add(hang2);
            hang[i] = hang2;
        }
        char[][] zifu4 = new char[hehe][l];
        for (int i = 0; i < hehe; i++) {
            for (int j = 0; j < l; j++) {
                zifu4[i][j] = hang[i].charAt(j);
            }
        }
        char[][] zifu3 = new char[l][hehe];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < hehe; j++) {
                zifu3[i][j] = zifu4[j][i];
            }
        }
        for (int i = 0; i < l; i++) {
            Arrays.sort(zifu3[i]);
        }
        StringBuilder jieguo = new StringBuilder();
        for (int i = 0; i < l; i++) {
            jieguo.append(zifu3[i][0]);
        }
        if (set.contains(jieguo.toString())){
            System.out.println("-");
        }else
        System.out.println(jieguo.toString());
    }
}