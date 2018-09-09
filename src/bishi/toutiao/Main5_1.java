package bishi.toutiao;

import java.util.Scanner;
import java.util.ArrayList;

public class Main5_1{
    public static void main(String[] args){
        Scanner shuru = new Scanner(System.in);
        while(shuru.hasNext()){
            int N = shuru.nextInt();
            int M = shuru.nextInt();
            int[][] shuzu = new int[M][2];
            for(int i = 0; i < M; i++){
                shuzu[i][0] = shuru.nextInt();
                shuzu[i][1] = shuru.nextInt();
            }

            int[] shuliang = new int[N+1];
            boolean[] wancheng = new boolean[N+1];

            for(int i = 0; i < M; i++){
                if(wancheng[shuzu[i][1]] == false){
                    ArrayList<Integer> lian = xunzhao(shuzu, shuzu[i][1]);
                    shuliang[shuzu[i][1]] = lian.size();
                }
                wancheng[shuzu[i][1]] = true;
            }

            int shu = 0;
            for(int i = 0; i < N; i++){
                if(shuliang[i+1] == N)
                    shu++;
            }
            System.out.println(shu);
        }
    }

    private static ArrayList<Integer> xunzhao(int[][] shuzu, int shu) {
        ArrayList<Integer> lianbiao = new ArrayList<Integer>();
        lianbiao.add(shu);
        for (int j = 0; j < lianbiao.size(); j++) {
            int jian = lianbiao.get(j);
            for (int i = 0; i < shuzu.length; i++) {
                if (shuzu[i][1] == jian) {
                    if (!lianbiao.contains(shuzu[i][0])) {
                        lianbiao.add(shuzu[i][0]);
                    }

                }
            }
        }
        return lianbiao;
    }
}