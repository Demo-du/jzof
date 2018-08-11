package bishi.Netease;


import java.util.Scanner;

public class Main1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String line = sc.nextLine();
       // String[] li1 = line.split(" ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []price=new int[n];
        int []issleep=new int[n];
        int []tmpsleep=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            issleep[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            tmpsleep[i]=issleep[i];
        }

        int zong = 0;
        int zuida = 0;
        for(int i=0; i<n; ++i){

            if(issleep[i] == 1){
                zong += price[i];
            }else{
                zuida = Math.max(zuida, fun(price,issleep, i, k));
            }
        }
        zong = zong+zuida;
        System.out.println(zong);
    }
    public static int fun(int[] price, int[] issleep, int suoyin, int g){
        int max = 0;
        for(int i=suoyin; i<price.length; ++i){
            if(issleep[i] == 0){
                max += price[i];
            }
            --g;
            if(g==0)
                break;
        }
        return max;
    }

}