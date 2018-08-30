package bishi.pdd2;
import java.util.Scanner;

public class Main2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] zifu = new String[n];
            for(int i = 0; i < n; i++){
                zifu[i] = sc.next();
            }
            char[][] bianjie = new char[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    bianjie[i][j] = zifu[i].toCharArray()[j];
                }
            }
            for(int i = 0; i < m; i++){
                boolean biaozhi = false;
                int hang = -1;
                int shuliang = 0;
                for(int j = n -1; j >= 0; j--){
                    if(!biaozhi && bianjie[j][i] == 'o'){
                        bianjie[j][i] = '.';
                    }else if(bianjie[j][i] == 'x'){
                        biaozhi = true;
                        hang = j;
                        shuliang = 1;
                    }
                    else if(bianjie[j][i] == 'o'){
                        bianjie[hang - shuliang][i] = 'o';
                        if(hang - shuliang != j){
                            bianjie[j][i] = '.';
                        }
                        shuliang++;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(bianjie[i][j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
