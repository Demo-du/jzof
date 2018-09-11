package bishi.baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\11 0011.
 */
public class Main2 {
    public static void main(String[] args) {
        int nums[]={1,1,1,0,1,1,1,1};
        System.out.println(stateOfLights(2,nums));
       /* Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int days=sc.nextInt();
            int []nums=new int[8];
            int []nums2=new int[8];
            for (int i=0;i<8;i++){
                nums[i]=sc.nextInt();
            }
            for (int i=0;i<days;i++){
                diedai(nums,nums2);
                copyarr(nums,nums2);
            }
            for (int i=0;i<8;i++){
                System.out.print(nums[i]+" ");
            }
        }
          */
    }
    public static void diedai(int []nums,int []nums2){
        for (int i=0;i<8;i++){
            if (i==0){
                if (nums[i+1]==1){
                    nums2[i]=1;
                }else {
                    nums2[i]=0;
                }
            }else if (i==7){
                if (nums[i-1]==1){
                    nums2[i]=1;
                }else {
                    nums2[i]=0;
                }
            }else {
                if (nums[i-1]==nums[i+1]){
                    nums2[i]=0;
                }else {
                    nums2[i]=1;
                }
            }
        }
    }
    public static void copyarr(int []nums,int []nums2){
        for (int i=0;i<nums2.length;i++){
            nums[i]=nums2[i];
        }
    }
    static List<Integer> stateOfLights(int days,int []lights){
        List<Integer> res=new ArrayList<>();
        int []nums2=new int[8];
        for (int i=0;i<days;i++){
            diedai(lights,nums2);
            copyarr(lights,nums2);
        }
        for (int i=0;i<8;i++){
            res.add(nums2[i]);
        }
        return res;
    }
}
