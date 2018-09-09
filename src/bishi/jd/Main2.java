package bishi.jd;

import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner shuru=new Scanner(System.in);
        int tt=shuru.nextInt();
        int[][]diedai=new int[tt][3];
        for(int i=0;i<tt;i++){
            diedai[i][0]=shuru.nextInt();
            diedai[i][1]=shuru.nextInt();
            diedai[i][2]=shuru.nextInt();
        }
        int shuliang=0;
        for(int i=0;i<tt;i++){
            for(int hh=0;hh<tt;hh++){
                if(hh==i)
                    continue;
                if(diedai[hh][0]>diedai[i][0]&&diedai[hh][1]>diedai[i][1]&&diedai[hh][2]>diedai[i][2]){
                    shuliang++;
                    break;
                }
            }
        }
        System.out.println(shuliang);
    }
}
