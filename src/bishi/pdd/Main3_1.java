package bishi.pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\7\22 0022.
 */
public class Main3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine().trim();
            String shuzu[]=str.split(" ");
            int []nums=new int[shuzu.length];
            for(int i=0;i<nums.length;i++){
                nums[i]=Integer.valueOf(shuzu[i].trim());
            }
            Arrays.sort(nums);
            int cnt=1;
            int index1=0;
            int index2=nums.length-1;
            int tmp=0;//nums[index1];
            boolean []boo=new boolean[nums.length];
            boolean flg=true;
            while(true){
                flg=true;
                for(int i=0;i<nums.length;i++){
                    flg&=boo[i];
                }
                if(flg){
                    break;
                }
                for(int i=nums.length-1;i>=0;i--){
                    tmp+=nums[i];
                    if(tmp>300){
                        tmp=tmp-nums[i];
                        break;
                    }else {
                        boo[i]=true;
                    }
                }
                for(int i=0;i<nums.length;i++){
                    tmp+=nums[i];
                    if(tmp>300){
                        tmp=nums[i];
                        cnt++;
                        break;
                    }else {
                        boo[i]=true;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
