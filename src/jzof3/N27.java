package jzof3;

public class N27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Mirror(TreeNode root) {
        if(root==null){
        	return;
        }
        if(root.left==null&&root.right==null){
        	return ;
        }
        TreeNode tmp=new TreeNode();
        tmp=root.left;
        root.left=root.right;
        root.right=tmp;
       // if(root.left!=null){
        	Mirror(root.left);
        //}
       // if(root.right!=null){
        	Mirror(root.right);
       // }
    }
}
