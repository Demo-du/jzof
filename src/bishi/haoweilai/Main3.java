package bishi.haoweilai;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\28 0028.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine().trim();
            String uu[]=str.split(" ");
            int []nums=new int[uu.length];
            for (int i=0;i<nums.length;i++){
                nums[i]=Integer.valueOf(uu[i]);
            }
            int k=0;
            String res="";
            print(nums,k,res);
        }
    }
    public static void print(int []nums,int k,String res){
        if(k>=nums.length||res.length()>=nums.length){
            System.out.println(res);
            return;
        }else {
            if (nums[k]==0){
                print(nums,k+1,res+k);
                print(nums,k+1,res);
            }else {
                res+=k;
                print(nums,k+1,res);
            }
            /*for (int i=k;i<nums.length;i++){
                if(nums[i]==1){
                    res+=i;
                    print(nums,k+1,res);
                }else{
                    print(nums,k+1,res);
                    print(nums,k+1,res+i);
                }
            }*/
        }

    }
}
