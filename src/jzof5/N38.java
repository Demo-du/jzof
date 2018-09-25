package jzof5;

/**
 * Created by Administrator on 2018\9\25 0025.
 */
public class N38 {
    public static void main(String[] args) {
        String str="abc";
        char []shuzu=str.toCharArray();
        print(0,shuzu);
    }
    public static void print(int index,char []shuzu){
        if (index>=shuzu.length){
            System.out.println(String.valueOf(shuzu));
            return;
        }
        for (int i=index;i<shuzu.length;i++){
            swap(shuzu,index,i);
            print(index+1,shuzu);
            swap(shuzu,index,i);
        }
    }
    public static void swap(char []shuzu,int p,int r){
        char tmp=shuzu[p];
        shuzu[p]=shuzu[r];
        shuzu[r]=tmp;
    }
}
