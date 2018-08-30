package bishi.pdd2;


        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xue = scanner.nextInt();
        int putong = scanner.nextInt();
        int buff = scanner.nextInt();
        System.out.println(gongji(xue, putong, buff));
    }

    public static int gongji(int xue, int putong, int buff) {
        int count = 0;
        List<Integer> biao = new ArrayList<>();
        if (buff <= 2 * putong) {
            while (xue > 0) {
                xue -= putong;
                count++;
            }
        } else {
            biao.add(0);
            count++;
            while (xue > 0 && count >= 1) {
                if (biao.get(count - 1) == 0) {
                    xue -= buff;
                    biao.add(1);
                    count++;
                } else {
                    biao.add(0);
                    count++;
                }
            }
        }
        return count;
    }
}
