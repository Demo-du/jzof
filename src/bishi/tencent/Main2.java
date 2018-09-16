package bishi.tencent;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\16 0016.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [][]map=new int[m][2];
            HashSet<Integer> []set=new HashSet[n+1];
            for (int i=1;i<n+1;i++){
                set[i]=new HashSet<Integer>();
            }
            for (int i=0;i<m;i++){
                map[i][0]=sc.nextInt();
                map[i][1]=sc.nextInt();
                set[map[i][0]].add(map[i][1]);
            }
            for (int i=1;i<n+1;i++){
                for (int tmp:set[i]){
                    for (int tmp2:set[tmp]){
                        set[i].add(tmp2);
                    }
                }
            }
            int []input=new int[n+1];
            for (int i=1;i<n+1;i++){
                for (int tmp:set[i]){
                    input[tmp]++;
                }
            }
            int cnt=0;
            for (int i=1;i<n+1;i++){
                if (set[i].size()<input[i]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
