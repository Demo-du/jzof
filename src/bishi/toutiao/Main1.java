package bishi.toutiao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\9 0009.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine().trim();
            System.out.println(jie(str));
        }
    }
    public static int jie(String A) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int[] shuzu1 = new int[A.length()];
        char[] shuzu2 = A.toCharArray();
        for(int i=0; i<A.length(); i++){
            Integer zuihou = map.get(shuzu2[i]);
            if(zuihou == null){
                shuzu1[i] = i == 0 ? 1 : shuzu1[i-1] + 1;
                map.put(shuzu2[i], i);
            }
            else{
                int weizhi = zuihou + 1;
                int fanzhaun = shuzu1[i-1];
                int weizhi2 = i - fanzhaun;
                if(weizhi >= weizhi2){
                    shuzu1[i] = i - weizhi + 1;
                }
                else{
                    shuzu1[i] = i - weizhi2 + 1;
                }
                map.put(shuzu2[i], i);
            }
        }
        int zuida = shuzu1[0];
        for(int i: shuzu1) if(i > zuida) zuida = i;
        return zuida;
    }

}
