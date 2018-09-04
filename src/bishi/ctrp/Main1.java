package bishi.ctrp;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\4 0004.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine().trim();
            String []numsstr=str.split(" ");
            int len=numsstr[0].length()>numsstr[1].length()?numsstr[0].length():numsstr[1].length();
            int []tmp1=new int [len];
            int []tmp2=new int [len];
            int index=0;
            for (int i=numsstr[0].length()-1;i>=0;i--){
                tmp1[index]=numsstr[0].charAt(i)-'0';
                index++;
            }
            index=0;
            for (int i=numsstr[1].length()-1;i>=0;i--){
                tmp2[index]=numsstr[1].charAt(i)-'0';
                index++;
            }
            int []res=new int[len+1];
            for (int i=0;i<len;i++){
                res[i]=res[i]+tmp1[i]+tmp2[i];
                if (res[i]==2){
                    res[i+1]++;
                    res[i]=0;
                }else if(res[i]==3){
                    res[i+1]++;
                    res[i]=1;
                }else {

                }
            }
            String jieguo="";
            for (int i=len;i>=0;i--){
                jieguo+=res[i];
            }
            if (jieguo.charAt(0)=='0'){
                jieguo=jieguo.substring(1,jieguo.length());
            }
            System.out.println(jieguo);
        }
    }
}
