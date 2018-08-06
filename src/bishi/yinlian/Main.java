package bishi.yinlian;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\5 0005.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
          //  System.out.println(str);
            if (str.length()==1){
                System.out.println(str);
            }else {
                int len = str.length();
                int row = (len + 4)/4;
                //char[] charArr= str.toCharArray();
                char[][] arr = new char[row][row];
                int index=0;
                for ( int i = 0; i < row-1; i++) {
                    arr[0][i] = str.charAt(index++);
                }
                // index +=row-1;
                for(int i=0;i<row-1;i++){
                    arr[i][row-1]=str.charAt(index++);
                }
                //  index+=row-2;
                for (int i=row-1;i>0;i--){
                    arr[row-1][i]=str.charAt(index++);
                }
                for (int i=row-1;i>0;i--){
                    arr[i][0]=str.charAt(index++);
                }
                for (int i = 0; i < row ; i++) {
                    for (int j = 0; j < row; j++) {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }
            }

        }
    }
}
