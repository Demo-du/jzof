package bishi.pdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\7\22 0022.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            List<String> list=new ArrayList<>();
            list.add("Alice");
            list.add("Bob");
            list.add("Cathy");
            list.add("Dave");
            String res="";
            for(int i=0;i<n;i++){
                String tmp=list.get(0);
                list.remove(0);
                list.add(tmp);
                list.add(tmp);
                res=tmp;
            }
            System.out.println(res);
        }
    }
}
