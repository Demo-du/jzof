package bishi.Netease2;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String shuju = sc.next();
            int changdu = shuju.length();
            int[] shuzu = new int[changdu];
            int cnt1 = 0;
            int cnt2 = 0;
            int[] shu = new int[changdu-1];

            for(int i = 0; i < changdu; i++){
                if(shuju.charAt(i) == 'b'){
                    shuzu[i] = 1;
                    cnt1++;
                }
                else{
                    shuzu[i] = 0;
                    cnt2++;
                }
            }

            for(int i = 0; i < changdu-1; i++){
                shu[i] = 1;
                for(int j = i+1; j < changdu; j++){
                    if(shuzu[j] == shuzu[j-1])
                        break;
                    else
                        shu[i]++;
                }
            }

            Arrays.sort(shu);
            int cnt3 = shu[changdu-2];
            //System.out.println(count[len-2]);
            int jieguo = 0;
            if(cnt3 > (changdu - cnt3)){
                if(Math.abs(cnt1-cnt2) > 1)
                    jieguo = Math.min(cnt1, cnt2)*2+1;
                else
                    jieguo = cnt1 + cnt2;
            }
            else
                jieguo = cnt3;

            System.out.println(jieguo);

        }
    }
}