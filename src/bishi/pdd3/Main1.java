package bishi.pdd3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\21 0021.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine().trim();
            String res="";
            HashMap<String,Integer> map=new HashMap<>();
            for (int i=0;i<str.length();i++){
                if ((!(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z'))){
                    if (res.length()>0){
                        if (map.get(res)!=null){
                            int a=map.get(res);
                            map.put(res,a+1);
                            res="";
                        }else {
                            map.put(res,1);
                            res="";
                        }
                    }
                }else {
                    int tmp=str.charAt(i);
                    if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                        tmp=str.charAt(i)-('A'-'a');
                    }
                    res+=(char)tmp;
                }
            }
            res="";
            int cnt=0;
            for(String key:map.keySet())
            {
                if (map.get(key)>cnt){
                    cnt=map.get(key);
                    res=key;
                }
                if (map.get(key)==cnt&&!res.equals(key)){
                    cnt=map.get(key);
                    res+=" "+key;
                }
            }
            System.out.println(res);
        }
    }
}
