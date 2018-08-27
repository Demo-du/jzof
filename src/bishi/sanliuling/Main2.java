package bishi.sanliuling;

import java.util.Scanner;



import java.util.*;

public class Main2{
         public static void main(String []argv){
            Scanner shuru=new Scanner(System.in);
            String[] zifu1 = shuru.nextLine().split("?");
            int n = Integer.parseInt(zifu1[0]);
             int m = Integer.parseInt(zifu1[1]);
             int[] shuzu = new int[n];
             String[] zifu2 = shuru.nextLine().split("?");
             for(int i=0; i<n; ++i){
                 shuzu[i] = Integer.parseInt(zifu2[i]);
             }
             int yy = Integer.parseInt(shuru.nextLine());
             int[][] hehehe = new int[yy][2];
                for(int i=0; i<yy; ++i){
                    String[] zifu3 = shuru.nextLine().split("?");
                    hehehe[i][0] = Integer.parseInt(zifu3[0]);
                    hehehe[i][1] = Integer.parseInt(zifu3[1]);
                }

             for(int i=0; i<yy; ++i){
                 Set<Integer> jihe = new HashSet<Integer>();
                 for(int j=hehehe[i][0];j<=hehehe[i][1]; ++j){
                     jihe.add(shuzu[j-1]);
             }
             System.out.println(jihe.size());
         }
         }
        }
