package jzof4;

/**
 * Created by Administrator on 2018\7\27 0027.
 */
public class N26 {
    public static void main(String[] args) {
        TreeNode n1=new TreeNode(8);
        TreeNode n2=new TreeNode(8);
        TreeNode n3=new TreeNode(7);
        TreeNode n4=new TreeNode(9);
        TreeNode n5=new TreeNode(2);
        TreeNode n6=new TreeNode(4);
        TreeNode n7=new TreeNode(7);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n5.left=n6;
        n5.right=n7;
        TreeNode n8=new TreeNode(8);
        TreeNode n9=new TreeNode(9);
        TreeNode n10=new TreeNode(1);
        n8.left=n9;
        n8.right=n10;
        System.out.println(isch(n1,n5));
    }
    public static boolean isch(TreeNode r1,TreeNode r2){
        if(r2==null){
            return true;
        }
        if(r1==null){
            return false;
        }
        if(r1.value==r2.value){
            boolean res= isch(r1.left,r2.left)&&isch(r1.right,r2.right);
            if(res){
                return res;
            }else {
                return isch(r1.right,r2)||isch(r1.left,r2);
            }
        }else {
            return isch(r1.right,r2)||isch(r1.left,r2);
        }
        //return false;
    }
}
