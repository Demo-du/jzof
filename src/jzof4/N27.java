package jzof4;

/**
 * Created by Administrator on 2018\7\31 0031.
 */
public class N27 {
    public static void main(String[] args) {

    }
    public static void mirror(TreeNode r){
        if(r==null){
            return;
        }
        if(r.left==null&&r.right==null){
            return;
        }
        TreeNode tmp=r.left;
        r.left=r.right;
        r.right=tmp;
        if(r.left!=null){
            mirror(r.left);
        }
        if(r.right!=null){
            mirror(r.right);
        }
    }
}
