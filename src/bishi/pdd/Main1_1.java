package bishi.pdd;

import java.util.*;

/**
 * Created by Administrator on 2018\7\22 0022.
 */
public class Main1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt()+1;
            Queue<String> list=new LinkedList<>();
            int cnt=0;
            int suoyin=0;
            while (true){
                cnt+=4*Math.pow(2,suoyin);
                if(cnt>n){
                    cnt-=4*Math.pow(2,suoyin);
                    break;
                }
                suoyin=suoyin+1;
            }
            n=n-cnt;
            n/=Math.pow(2,suoyin);
            String res="";
            /*for(int i=0;i<n;i++){
                String tmp=list.get(0);
                list.remove(0);
                list.add(tmp);
                list.add(tmp);
                res=tmp;
            }*/
           if(n==0){
               res="Alice";
           }
            if(n==1){
                res="Bob";
            }
            if(n==2){
                res="Cathy";
            }
            if(n==3){
                res="Dave";
            }
            System.out.println(res);

        }
    }
}
