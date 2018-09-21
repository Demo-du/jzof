package bishi.pdd3;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\21 0021.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int []price=new int[n];
            for (int i=0;i<n;i++){
                price[i]=sc.nextInt();
            }
            int []xi=new int[m];
            int []yi=new int[m];
            for (int i=0;i<m;i++){
                xi[i]=sc.nextInt();
                yi[i]=sc.nextInt();
            }
            int sum=0;
            boolean []use=new boolean[m];
            for (int i=0;i<n;i++){
                int jieprce=Integer.MAX_VALUE;
                int index=-1;
                int tmp1=0;
                for (int j=0;j<m;j++){
                    if (!use[j]){
                        if (price[i]>=xi[j]){
                            int tmp=price[i]-yi[j];
                            if (tmp<0){
                                tmp=0;
                            }
                            if (tmp<jieprce||(tmp==jieprce&&xi[j]>=tmp1)){
                                jieprce=tmp;
                                tmp1=xi[j];
                                index=j;
                            }
                        }
                    }
                }
                if (index<0){
                    sum+=price[i];
                }else {
                    use[index]=true;
                    sum+=jieprce;
                }
            }
            System.out.println(sum);
        }
    }
}
