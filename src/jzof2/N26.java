package jzof2;



public class N26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		TreeNode n10=new TreeNode(2);
		n8.left=n9;
		n8.right=n10;
		N26 n26=new N26();
		System.out.println(n26.HashSubTree(n1, n5));
	}
    public boolean HashSubTree(TreeNode r1,TreeNode r2){
    	if(r2==null){
    		return true;
    	}
    	if(r1==null){
    		return false;
    	}
    	boolean res=false;
    	if(r1.value==r2.value){
    		res=check(r1,r2);
    	}
    	if(!res){
    		res=HashSubTree(r1.right,r2);
    	}
    	if(!res){
    		res=HashSubTree(r1.left,r2);
    	}
    	return res;
    }
    public boolean check(TreeNode r1,TreeNode r2){
    	if(r2==null){
    		return true;
    	}
    	if(r1==null){
    		return false;
    	}
    	boolean res=true;
    		res=check(r1.left,r2.left);
    		if(res){
    			res=check(r1.right,r2.right);
    		}
    	return res;
    }
}
