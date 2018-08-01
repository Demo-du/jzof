package jzof4;

/**
 * Created by Administrator on 2018\8\1 0001.
 */
public class N28 {
    public static void main(String[] args) {

    }
    public static boolean isSys(TreeNode r){
        return isSys(r,r);
    }
    public static boolean isSys(TreeNode r1,TreeNode r2){
        if (r1==null&&r2==null){
            return true;
        }
        if(r1==null||r2==null){
            return false;
        }
        if(r1.value!=r2.value){
            return false;
        }
        return isSys(r1.left,r2.right)&&isSys(r1.right,r2.left);
    }
}
