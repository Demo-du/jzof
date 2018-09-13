package bishi.baidu;


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String c =sc.next();

            char[] res = new char[str.length()+1];
            int i=0;
            while(str.charAt(i)- c.charAt(0) <=0){
                i++;
            }
            int j = 0;
            int index = 0;
            while (j<i){
                res[index] = str.charAt(j);
                j++;
                index++;
            }
            res[index++] = c.charAt(0);

            while (j<str.length()){
                res[index] = str.charAt(j);
                j++;
                index++;
            }
            for (int k = 0; k <res.length ; k++) {
                System.out.print(res[k]);
            }
        }
    }
}