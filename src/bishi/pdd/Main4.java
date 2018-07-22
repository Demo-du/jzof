package bishi.pdd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\7\22 0022.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int N=sc.nextInt();
            int K=sc.nextInt();
            String str=sc.next();
            int []nums=new int[N];
            for (int i=0;i<N;i++){
                nums[i]=str.charAt(i)-'0';
            }
            int []hash=new int[10];
            for (int i=0;i<nums.length;i++){
                hash[nums[i]]++;
            }
            int max=-1;
            int tmp=-1;
            for(int i=9;i>=0;i--){
                if(hash[i]>=max){
                    tmp=i;
                    max=hash[i];
                }
            }
            int dis=K-max;
            int index=0;
            int money=0;
            for(int i=0;i<nums.length;i++){
                if(index>=dis){
                    break;
                }
                if(nums[i]!=tmp){
                    int jiage=(tmp-nums[i])>0?(tmp-nums[i]):(nums[i]-tmp);
                    nums[i]=tmp;
                    money+=jiage;
                    index++;
                }
            }
            System.out.println(money);
            for (int i=0;i<nums.length;i++){
                System.out.print(nums[i]);
            }
            System.out.println();
        }
    }
}
