package bishi.dxm;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\26 0026.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []nums=new int[n];
            for (int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int []bian=new int[n-1];
            for (int i=0;i<n-1;i++){
                int cnt=0;
                for (int j=i+1;j<n;j++){
                    if (nums[i]!=nums[j]){
                        cnt++;
                    }
                }
                bian[i]=cnt;
            }
            String res="";
            for (int i=0;i<bian.length;i++){
                res+=bian[i]+" ";
            }
            System.out.println(res.trim());
        }
    }
}
