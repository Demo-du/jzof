package bishi.Netease2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\8 0008.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [][]nums=new int[n][2];
            int []map=new int[m+1];
            for (int i=0;i<n;i++){
                nums[i][0]=sc.nextInt();
                nums[i][1]=sc.nextInt();
                map[nums[i][0]]++;
            }
            ArrayList<Integer> shoumai=new ArrayList<>();
            for (int i=2;i<m;i++){
                int cha=map[i]-map[1];
                if (cha>0){
                    for (int j=0;j<cha/2+1;j++){
                        shoumai.add(i);
                    }
                }
            }
            boolean []visited=new boolean[n];
            int sum=0;
            for (int i=0;i<shoumai.size();i++){
                int shoumairen=shoumai.get(i);
                int index=0;
                int min=Integer.MAX_VALUE;
                for (int j=0;j<n;j++){
                    if (nums[j][0]==shoumairen&&nums[j][1]<min&&visited[j]==false){
                        index=j;
                        min=nums[j][1];
                    }
                }
                visited[index]=true;
                sum+=min;
            }
            System.out.println(sum);
        }
    }


}
