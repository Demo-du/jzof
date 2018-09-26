package bishi.dxm;

import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\26 0026.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []nums=new int[n];
            for (int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int []bian=new int[n];
            for (int i=1;i<n;i++){
                int cnt=0;
                for (int j=0;j<i;j++){
                    for (int k=i;k<n;k++){
                        if (nums[j]!=nums[k]){
                            cnt++;
                        }
                    }
                }
                bian[i]=cnt;
            }
            String res="";
            for (int i=1;i<bian.length;i++){
                res+=bian[i]+" ";
            }
            System.out.println(res.trim());
        }
    }
}
