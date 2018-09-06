package bishi.meituan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\6 0006.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int t=sc.nextInt();
            int []nums=new int [n];
            for (int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            int he=-1;
            for (int i=0;i<n;i++){
                int tmp=nums[i];
                if (map.get(tmp)==null){
                    map.put(tmp,1);
                }else {
                    int v=map.get(tmp);
                    map.put(tmp,v+1);
                    if (v+1>=t){
                        he=tmp;
                        break;
                    }
                }
            }
            int index1=0;int index2=1;
            int cnt=0;
            int nums2=0;
            if (nums[index1]==he){
                nums2++;
            }
            while (index2>index1&&index2<nums.length){

            }
        }
    }
}
