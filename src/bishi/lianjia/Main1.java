package bishi.lianjia;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\8\18 0018.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
           int n=sc.nextInt();
            int map[][]=new int[n][2];
            for(int i=0;i<n;i++){
                map[i][0]=sc.nextInt();
                map[i][1]=sc.nextInt();
            }
            List<Integer> list=new ArrayList<>();
            int [][]tmp=new int[n][3];
            for (int i=0;i<tmp.length;i++){
                tmp[i][0]=map[i][0];
                tmp[i][1]=map[i][1];
                tmp[i][2]=i+1;
            }
            for(int i=0;i<tmp.length-1;i++){
                for(int j=i+1;j<tmp.length;j++){
                    if(tmp[i][0]>tmp[j][0]){
                        swap(tmp,i,j);
                    }
                }
            }
            for(int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if(j>=n-1){
                        list.add(tmp[i][2]);
                        break;
                    }
                    if(j==i){
                        continue;
                    }
                    if(j==i-1&&j<n-2){
                        if(tmp[j][1]>tmp[j+2][0]){
                            break;
                        }
                    }
                    if(j==i-1&&j>n-2){
                        list.add(tmp[i][2]);
                        break;
                    }
                    if(j!=i-1&&tmp[j][1]>tmp[j+1][0]){
                        break;
                    }
                    if(j>=n-2){
                        list.add(tmp[i][2]);
                        break;
                    }
                    /*if(j==i){
                        continue;
                    }
                    if(j==i-1&&j<n-2){
                        if(tmp[j][1]>tmp[j+2][0]){
                            break;
                        }
                    }
                    if(j==i-1&&j>n-2){
                        list.add(i+1);
                        break;
                    }
                    if(tmp[j][1]>tmp[j+1][0]){
                        break;
                    }
                    if(j>=n-2){
                        list.add(i+1);
                    }*/
                }
            }
           System.out.println(list.size());
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }
    public static void swap(int [][]nums,int i,int j){
        int e=nums[i][0];
        int k=nums[i][1];
        int c=nums[i][2];
        nums[i][0]=nums[j][0];
        nums[i][1]=nums[j][1];
        nums[i][2]=nums[j][2];
        nums[j][0]=e;
        nums[j][1]=k;
        nums[j][2]=c;
    }
}
