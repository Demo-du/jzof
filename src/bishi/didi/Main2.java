package bishi.didi;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\18 0018.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int np=sc.nextInt();
            int nq=sc.nextInt();
            int nr=sc.nextInt();
            int []ap={np};
            int []aq={nq};
            int []ar={nr};
            int []num={0};
            int len=np+nq+nr;
            char []tmp=new char[len];
            if (len==0){
                System.out.println(0);
                continue;
            }
            solve(ap,aq,ar,num,0,len,tmp);
            System.out.println(num[0]);
        }
    }
    public static void solve(int []ap,int []aq,int []ar,int []num,int index,int len,char []tmp){
        if (index>=len){
            /*for (int i=0;i<tmp.length;i++){
                System.out.print(tmp[i]);
            }
            System.out.println();*/
            num[0]++;
            return;
        }
        if (index==0){
            if (ap[0]>0){
                tmp[index]='P';
                ap[0]--;
                solve(ap,aq,ar,num,index+1,len,tmp);
                ap[0]++;
            }
            if (aq[0]>0){
                tmp[index]='Q';
                aq[0]--;
                solve(ap,aq,ar,num,index+1,len,tmp);
                aq[0]++;
            }
            if (ar[0]>0){
                tmp[index]='R';
                ar[0]--;
                solve(ap,aq,ar,num,index+1,len,tmp);
                ar[0]++;
            }

        }
        if ((ap[0]>0&&index>0)){
            if (tmp[index-1]!='P'){
                tmp[index]='P';
                ap[0]--;
                solve(ap,aq,ar,num,index+1,len,tmp);
                ap[0]++;
            }
        }
        if ((aq[0]>0&&index>0)){
            if (tmp[index-1]!='Q'){
                tmp[index]='Q';
                aq[0]--;
                solve(ap,aq,ar,num,index+1,len,tmp);
                aq[0]++;
            }
        }
        if ((ar[0]>0&&index>0)){
            if (tmp[index-1]!='R'){
                tmp[index]='R';
                ar[0]--;
                solve(ap,aq,ar,num,index+1,len,tmp);
                ar[0]++;
            }
        }
        return;
    }
}
