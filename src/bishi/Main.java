

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\5 0005.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(str);
            int len = str.length();
            int row = (len + 4)/4;
            //char[] charArr= str.toCharArray();
            char[][] arr = new char[row][row];
            for (int i = 0; i < row-1; i++) {
                arr[0][i] = str.charAt(i);
            }

            for (int i = 0; i <row-3 ; i++) {
                for (int j = 0; j < row-1; j++) {
                    if(j==0){
                        arr[i][j] = str.charAt(row - 1 - i);
                    }
                    if(j==row-1){
                        arr[i][j] = str.charAt(row - 1 + i);
                    }
                    else{
                        arr[i][j] = ' ';
                    }
                }
            }

            for (int i = 0; i < row-1; i++) {
                arr[row - 1][i] = str.charAt(len - row + 2 - i);
            }

            for (int i = 0; i < row-1 ; i++) {
                for (int j = 0; j < row-1; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}