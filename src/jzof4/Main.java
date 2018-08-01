package jzof4;

/**
 * Created by Administrator on 2018\8\1 0001.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String s=sc.nextLine().trim();
            int []nums=new int[400];
            int max=0;
            for(int i=0;i<s.length();i++) {
                nums[s.charAt(i)]++;
                if(nums[s.charAt(i)]>max) {
                    max=nums[s.charAt(i)];
                }
            }
           // for(int i=0;i<max;i++) {
                for(int j=0;j<400;j++) {
                    if(nums[j]>1) {
                        System.out.print((char)j);
                        nums[j]--;
                    }
                }
         //   }
            System.out.println();
        }
    }

}
