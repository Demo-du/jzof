package jzof4;

/**
 * Created by Administrator on 2018\7\17 0017.
 */
public class N19 {
    public static void main(String[]args){

    }
    public static boolean match(String str,String pat){
        if(str==null||pat==null){
            return false;
        }
        return matchCore(0,0,str,pat);
    }
    public static boolean matchCore(int index1,int index2,String str,String pat){
        if(index1==str.length()&&index2==pat.length()){
            return true;
        }
        if(index1!=str.length()&&index2==pat.length()){
            return false;
        }
        if(pat.charAt(index2+1)=='*'){
            if(pat.charAt(index2)==str.charAt(index1)||(pat.charAt(index2)=='.')&&index1!=str.length()){
                return matchCore(index1+1,index2+2,str,pat)||
                        matchCore(index1+1,index2,str,pat)||
                        matchCore(index1,index2+2,str,pat);
            }else{
                return matchCore(index1,index2+2,str,pat);
            }
        }
        if(str.charAt(index1)==pat.charAt(index2)||((pat.charAt(index2)=='.')&&index2==pat.length())){
            return matchCore(index1+1,index2+1,str,pat);
        }
        return false;
    }
}
