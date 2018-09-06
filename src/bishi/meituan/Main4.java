package bishi.meituan;


 import java.util.ArrayList;
 import java.util.Scanner;

public class Main4{

    public static void main(String[] args) {
        Scanner shuru = new Scanner(System.in

        );
        int n = Integer.parseInt(shuru.nextLine());
        ArrayList<Integer> lianbiao1 = new ArrayList<>();
        ArrayList<Integer> lianbiao2 = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            String[] qiege = shuru.nextLine().split(" ");
            lianbiao1.add(Integer.parseInt(qiege[0]));
            lianbiao2.add(Integer.parseInt(qiege[1]));
        }
        System.out.println(solve(lianbiao1, lianbiao2, n));
    }
    private static int solve(ArrayList<Integer> lianbiao1, ArrayList<Integer> lianbiao2, int n) {
        int jieguo = 0;
        for (int num = 1; num <= n; num++) {
            int zancun = 0;
            for (int j = 0; j < lianbiao1.size(); j++) {
                if (lianbiao1.get(j) == num)
                {
                    zancun++;
                }
            }
            zancun = zancun <= 1 ? zancun : zancun + zancun - 1;
            jieguo = jieguo + zancun;
        }
        return jieguo;

    }

}
