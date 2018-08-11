package bishi.Netease;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\11 0011.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            String str="";
            for(int i=0;i<n;i++){
                str+='a';
            }
            for(int i=0;i<m;i++){
                str+='z';
            }
            char []shuzu=str.toCharArray();
            for (int i=0;i<shuzu.length;i++){

            }
            boolean []flag=new boolean[1];
            flag[0]=true;
            paixu(shuzu,0,shuzu.length-1,k,flag);
            if (flag[0]==false){
                System.out.println(-1);
            }

        }
    }
    public static void paixu(char []shuzu,int qian,int hou,int k,boolean []flag){
        int index=0;
        if (hou<=1){
            return;
        }
        if (qian==hou){
            index++;
            if(index==k){
                for (int hh=0;hh<shuzu.length;hh++){
                    System.out.print(shuzu[hh]);
                    System.out.println();
                }
                flag[0]=false;
                return;
            }
            //======
        }else {
            for (int i=qian;i<hou;i++){
                swap(shuzu,i,qian);
                int tmp2=0;
                /*for(int gg=1;gg<shuzu.length;gg++){
                    if(shuzu[i]==shuzu[gg]){
                        continue;
                    }else {
                        tmp2=gg;
                        break;
                    }
                }*/
                paixu(shuzu,qian+1,hou,k,flag);
                swap(shuzu,qian,i);
            }
        }
    }
    public static void swap(char []shuzu,int i,int j){
        char tmp=shuzu[i];
        shuzu[i]=shuzu[j];
        shuzu[j]=tmp;
    }
}
