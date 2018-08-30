package bishi.pdd2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\30 0030.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int []xu=new int[1];
            if (!isxunhuan(a,b)){
                System.out.println("-1 0");
                continue;
            }
            System.out.println(xu[0]+" "+qiuyu(a, b, xu).length());
           // panduan(a, b);
           // System.out.println(xianshi(a,b));
        }
    }
    static void panduan(int p, int q)
    {
        int he=0;
        int []shengyu=new int[q];
        shengyu[0]=p;
        int zongliang=1;
        int biaozhi=0;
        int i,j,m,n;

        m=p; n=q;
        for(i=0;i<q;i++)
        {
            int shuliang=(m*10)%n;
            if (shuliang==0)
                return;
            else{
                for(j=0;j<zongliang;j++)
                {
                    if (shengyu[j]==shuliang)
                    {
                        biaozhi=1;
                        he++;
                        //System.out.println(p+" "+q+ ""+(j)+""+count);
                        System.out.print((j) + " ");
                       // printf("%d div %d \t start:%d, end: %d\n", p,q,j+1,count);
                        return;
                    }
                }
                if(biaozhi==0)
                    shengyu[zongliang++]=shuliang;
                else
                    return;
            }
            m=shuliang;
        }
    }
    static String qiuyu(int qian,int hou,int []xu){
        ArrayList<Integer> biao=new ArrayList<Integer>();
        StringBuffer sbtmp=new StringBuffer();
        qian=qian%hou;
        while(qian!=0){

            if(biao.contains(qian)){
                int i=0;
                for(;i<sbtmp.length();i++){
                    if(sbtmp.charAt(i)-'0'==qian*10/hou){//记录循环节开始的位置
                        xu[0]=i;
                        break;
                    }
                }
                sbtmp.delete(0, i);
                break;

            }else{
                biao.add(qian);//转入余数
                sbtmp.append(qian*10/hou);//装入商的值
            }
            qian=qian*10%hou;
        }
        return sbtmp.toString();
    }
    public static int  xianshi(int a, int b) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();//记录余数个数的数据结构
        boolean xunhuan = true;
        double he = 0d;
        int jilu = a % b;
        int biaozhi = 0;
        while (xunhuan) {

            if (jilu == 0) {
                he = (double) a / (double) b;
                return (int)he;
            } else if (!map.containsKey(jilu)) {
                map.put(jilu, biaozhi);
                biaozhi++;
            } else {
                he = biaozhi - map.get(jilu);
                return (int)he;
            }

            while (jilu < b) {
                jilu = jilu * 10;
            }
            jilu %= b;
        }
        return (int)he;
    }
    public static long zuidagongyue(long a, long b) {
        long t1 = 0;
        while (true) {// 循环的辗转相除法
            t1 = a % b;
            a = b;
            b = t1;
            if (b == 0) {
                return a;
            }
        }
    }
    public static boolean isxunhuan(long a, long b) {
        long chushu = zuidagongyue(a, b);
        b = b / chushu;
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        if (b == 1) {
            return false;
        } else {
            return true;
        }
    }
}
