package jzof2;



public class N54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N54 n54=new N54();
        TreeNode n1=new TreeNode(5);
        TreeNode n2=new TreeNode(3);
        TreeNode n3=new TreeNode(7);
        TreeNode n4=new TreeNode(2);
        TreeNode n5=new TreeNode(4);
        TreeNode n6=new TreeNode(6);
        TreeNode n7=new TreeNode(8);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        int[]k={3};
        System.out.println(n54.KthNode(n1, k).value);
	}
    TreeNode KthNode(TreeNode r,int []k){
    	TreeNode target=null;
    	if(r.left!=null)
    	    target=KthNode(r.left,k);
    	if(target==null){
    		if(k[0]==1){
    			return r;
    		}
    		k[0]--;
    	}
    	if(target==null&&r.right!=null){
    		target=KthNode(r.right,k);
    	}

    	return target;
    }
}
