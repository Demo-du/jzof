package bishi.pdd2;


        import java.util.Scanner;



public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in

        );
        while (sc.hasNextLine()) {
            String shuru = sc.nextLine();
            int xue = Integer.valueOf(shuru);

            shuru = sc.nextLine();
            int putong = Integer.valueOf(shuru);

            shuru = sc.nextLine();
            int bufu = Integer.valueOf(shuru);

            int shuliang = 0;

            if (bufu >= putong * 2) {
                while (xue > 0) {
                    xue -= bufu;
                    shuliang += 2;
                }

                if (xue + bufu <= putong) {
                    shuliang --;
                }

            }else {
                while (xue > 0) {
                    xue -= putong;
                    shuliang += 1;
                }
            }
            System.out.println(shuliang);

        }
        sc.close();
    }
}
