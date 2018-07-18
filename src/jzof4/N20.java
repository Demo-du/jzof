package jzof4;

/**
 * Created by Administrator on 2018\7\18 0018.
 */
public class N20 {
    public static void main(String[] args) {

    }
    public static boolean solve(String str){
        if(str==null||str.length()==0){
            return false;
        }
        int index=0;
        if(str.charAt(index)=='-'||str.charAt(index)=='+'){
            index++;
        }
        while (str.charAt(index)>='0'&&str.charAt(index)<='9'){
            index++;
        }
        if(str.charAt(index)=='.'){
            index++;
        }
        while (str.charAt(index)>='0'&&str.charAt(index)<='9'){
            index++;
        }
        if(str.charAt(index)=='e'||str.charAt(index)=='E'){
            index++;
        }
        return false;
    }
}
