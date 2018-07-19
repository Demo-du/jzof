package jzof4;

/**
 * Created by Administrator on 2018\7\19 0019.
 */
public class N21 {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8};
        solve(nums);
    }
    public static void solve(int []nums){
        int len=nums.length;
        int index1=0;
        int index2=len-1;
        while(index1<index2){
            while ((nums[index1]&1)==1&&index1<index2){
                index1++;
            }
            //swap(nums,index1,index2);
            while ((nums[index2]&1)==0&&index1<index2){
                index2--;
            }
            swap(nums,index1,index2);
        }
        for (int i=0;i<len;i++){
            System.out.print(nums[i]);
        }
    }
    public static void swap(int []nums,int index1,int index2){
        int tmp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=tmp;
    }
}
