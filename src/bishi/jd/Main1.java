package bishi.jd;
import java.util.*;


public class Main1 {
    public static void main(String[] args) {
        Scanner shuru=new Scanner(System.in);
        while(shuru.hasNext()){
            int T=shuru.nextInt();
            for (int k=0;k<T;k++){
                int N=shuru.nextInt();
                int M=shuru.nextInt();

                int[][] shuzu = new int[N+1][N+1];
                for(int i=0; i<M; ++i){
                    int x = shuru.nextInt();
                    int y = shuru.nextInt();
                    shuzu[x][y] = 1;
                    shuzu[y][x] = 1;
                }

                Set<List<Integer>> jihe =  solve22(shuzu);

                List<List<Integer>> biao1= new ArrayList<List<Integer>>(jihe);
                boolean biaozhi = true;
                for(int i=0; i<biao1.size(); ++i){
                    biaozhi = true;
                    List<Integer> list1 = biao1.get(i);
                    for(int j=i+1; j<biao1.size(); ++j){
                        List<Integer> biao2 = biao1.get(j);
                        boolean flag = jiaoji(shuzu, list1, biao2);
                        if(flag == false) {
                            biaozhi = false;
                            break;
                        }
                    }
                    if( biaozhi == false){
                        break;
                    }
                }
                if(biaozhi == false)
                    System.out.println("No");
                else
                    System.out.println("Yes");

            }
        }
    }

    public static Set<List<Integer>> solve22(int[][] nums){
        Set<List<Integer>> jihe = new HashSet<List<Integer>>();
        for(int i=1; i<nums.length; ++i){
            List<Integer> list = new ArrayList<Integer>();
            for(int j=1; j<nums.length; ++j){
                if(nums[i][j] == 0){
                    list.add(j);
                }
            }
            jihe.add(new ArrayList<>(list));
        }
        return jihe;
    }

    public static boolean jiaoji(int[][] nums, List<Integer> biao1, List<Integer> biao2){
        for(int i=0; i<biao1.size(); ++i){
            for(int j=0; j<biao2.size(); ++j){
                if(nums[biao1.get(i)][biao2.get(j)] == 0)
                    return false;
            }
        }
        return true;
    }



}