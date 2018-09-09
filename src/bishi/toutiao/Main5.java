package bishi.toutiao;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\9 0009.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.nextLine().trim();
            String []num1=str1.split(" ");
            int M=num1.length;
            int [][]map=new int[M][M];
            for (int i=0;i<M;i++){
                map[0][i]=num1[i].charAt(0)-'0';
            }
            for (int i=1;i<M;i++){
                for (int j=0;j<M;j++){
                    map[i][j]=sc.nextInt();
                }
            }
            chazhao(map);
        }
    }
    static int digui(int [][] jiebn, int x, int y,boolean[][] fangwen){
        if(x >=  jiebn.length || y >= jiebn[0].length || x < 0 || y < 0)
            return 0;
        if(fangwen[x][y] == true)
            return 0;
        if(jiebn[x][y] == 0)
            return 0;
        fangwen[x][y] = true;
        return 1 + digui(jiebn, x + 1, y, fangwen) + digui(jiebn, x - 1, y, fangwen) + digui(jiebn, x, y + 1, fangwen) + digui(jiebn, x, y - 1, fangwen);
    }
    static void chazhao(int [][] jiebn) {
        if(jiebn.length<=0)
            return;
        int shu = 0;
        int shendu = jiebn.length;
        int you = jiebn[0].length;
        boolean[][] fangwen=new boolean[shendu][you];
        for(int i = 0;i < shendu;i++){
            for(int j = 0;j < you;j++){
                if(fangwen[i][j] == true)
                    continue;
                if(jiebn[i][j] == 0){
                    fangwen[i][j] = true;
                    continue;
                }
                digui(jiebn, i, j, fangwen);
                int temp = digui(jiebn, i, j, fangwen);
                ++shu;
            }
        }
        System.out.println(shu);
    }

}
