package bishi.yj;

import java.util.HashSet;

/**
 * Created by Administrator on 2018\9\19 0019.
 */
public class Main {
    public static void main(String[] args) {
        String []strs={"usr/abc.txt","/etc/fbb/ss.txt"};
        solve(strs);
    }
    public static void solve(String []strs){
        HashSet<String> set=new HashSet<>();
        for (int i=0;i<strs.length;i++){
            getnum(strs[i],set);
        }
        System.out.println(set.size());
    }
    public static void getnum(String str,HashSet<String> set){
        String res="";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='/'){
                set.add(res);
               // res="";
            }else {
                res+=str.charAt(i);
            }
        }
    }
}
