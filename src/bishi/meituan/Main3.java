package bishi.meituan;

import java.util.HashMap;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner shuru=new Scanner(System.in);
        int n=shuru.nextInt();
        int k=shuru.nextInt();
        int t=shuru.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=shuru.nextInt();
        }
        System.out.println(solve(nums, k, t));
    }
    public static int solve(int[] nums, int k, int t){
        HashMap<Integer,Integer>zhimap=new HashMap<>();
        int res=0;
        for(int i=0;i<k;i++){
            if(zhimap.containsKey(Integer.valueOf(nums[i]))) {
                int cishu = zhimap.get(Integer.valueOf(nums[i]));
                cishu++;
                zhimap.put(nums[i],cishu);
            }
            else{
                zhimap.put(nums[i],1);
            }
        }
        for(Integer value:zhimap.values()) {
            if (value >= t) {
                res++;
                break;
            }
        }
        for(int i=k;i<nums.length;i++){
            int hehe=zhimap.get(Integer.valueOf(nums[i-k]));
            hehe--;
            zhimap.put(nums[i-k],hehe);
            if(zhimap.containsKey(nums[i])){
                int lala=zhimap.get(nums[i]);
                lala++;
                zhimap.put(nums[i],lala);
                for(Integer zhi:zhimap.values())
                    if(zhi>=t){
                        res++;
                        break;
                    }
            }
            else{
                zhimap.put(nums[i],1);
                for(Integer zhi:zhimap.values())
                    if(zhi>=t){
                        res++;
                        break;
                    }
            }
        }
        return res;
    }
}