package jzof2;



public class N55 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(7);
		TreeNode n7=new TreeNode(7);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n5.left=n7;
		n3.right=n6;
		N55 n55=new N55();
		System.out.println(n55.getdep(n1));
	}
    public int getdep(TreeNode r){
    	if(r==null){
    		return 0;
    	}
    	int dr=0;
    	int dl=0;
    	if(r.left!=null){
    		dl=getdep(r.left);
    	}
    	if(r.right!=null){
    		dr=getdep(r.right);
    	}
    	return dl>dr?dl+1:dr+1;
    }
}
