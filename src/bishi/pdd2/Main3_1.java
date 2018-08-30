package bishi.pdd2;


        import java.util.LinkedList;
        import java.util.Scanner;
        import java.util.Vector;


public class Main3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] shuru = sc.nextLine().split(" ");
            int[] shuru1 = new int[2];
            for (int i = 0; i < 2; i++) {
                shuru1[i] = Integer.valueOf(shuru[i]);
            }
            int a = shuru1[0];
            int b = shuru1[1];

            qiuyu(a, b);
        }
        sc.close();
    }

    public static int qiuyu(int qian, int hou) {
        qian = qian % hou;

        if (qian == 0) {
            System.out.println(0 + " " + 0);
            return 0;
        }

        LinkedList<Integer> biao = new LinkedList<Integer>();

        while (true){
            biao.add(qian);
            qian *= 10;
            qian = qian % hou;
            if (qian == 0) {
                System.out.println(biao.size() + " " + 0);
                return 0;
            }
            if (biao.indexOf(qian) >= 0) {
                int suoyin = biao.indexOf(qian);
                int changdu = biao.size() - biao.indexOf(qian);
                System.out.println(suoyin + " " + changdu);
                return changdu;
            }
        }
    }
}
