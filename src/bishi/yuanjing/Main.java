package bishi.yuanjing;
import java.util.*;

/**
 * Created by Administrator on 2018\8\15 0015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            List<List<Integer>> jieguo = new ArrayList<List<Integer>>();
            int hh = sc.nextInt();
            int gg = sc.nextInt();
            ArrayList<ArrayList<Integer>> jie2 =combine(hh,gg);
            for(int i=0;i<jie2.size();i++)
            {
                System.out.print(jie2.get(i));
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> jie2 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> suh = new ArrayList<Integer>();
        int[] num = new int[n];
        for (int j = 0; j < n; j++) {
            num[j] = j + 1;
        }
        zongjie(n, k, num, 0, suh, jie2);
        return jie2;
    }

    private static void zongjie(int n, int k, int[] shuzu, int kaishi,
                                ArrayList<Integer> sub, ArrayList<ArrayList<Integer>> result) {
        if (sub.size() >= k) {
            ArrayList<Integer> c = new ArrayList<Integer>(sub);
            result.add(c);
        } else {
            for (int i = kaishi; i < shuzu.length; i++) {
                sub.add(shuzu[i]);
                zongjie(n, k, shuzu, i + 1, sub, result);
                sub.remove(sub.size() - 1);
            }
        }
    }

}