package bishi.Netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\11 0011.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []price=new int[n];
            int []issleep=new int[n];
            int []tmpsleep=new int[n];
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                price[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                issleep[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                tmpsleep[i]=issleep[i];
            }
            int max=0;
            max=jie(price,issleep);
            int jichu=max;
            //¼ÙÉèi½ÐÐÑ
            for(int i=0;i<n;i++){
                list=new ArrayList<>();
                //chushihua
                for(int j=0;j<n;j++){
                    tmpsleep[j]=issleep[j];
                }
                //jiaoxing
                for(int z=0;z<k;z++){
                    if(i+z>=n){
                        break;
                    }
                    if(tmpsleep[i+z]==0){
                        list.add(i+z);
                    }
                }
                int tmp1=0;
                for(int g=0;g<list.size();g++){
                    tmp1+=price[list.get(g)];
                }
                if(jichu+tmp1>max){
                    max=jichu+tmp1;
                }
            }
            System.out.println(max);
        }

    }
    public static int jie(int []price,int []issleep){
        int res=0;
        for(int i=0;i<price.length;i++){
            if(issleep[i]==1){
                res+=price[i];
            }
        }
        return res;
    }
}
