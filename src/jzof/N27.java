package jzof;

public class N27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode2 n1=new TreeNode2(8);
		TreeNode2 n2=new TreeNode2(6);
		TreeNode2 n3=new TreeNode2(10);
		TreeNode2 n4=new TreeNode2(5);
		TreeNode2 n5=new TreeNode2(7);
		TreeNode2 n6=new TreeNode2(9);
		TreeNode2 n7=new TreeNode2(11);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		System.out.println(fun(n1).left.left.value);
	}
    public static TreeNode2 fun(TreeNode2 p){
    	TreeNode2 res=null;
    	if(p==null){
    		return null;
    	}
    	if(p.left==null&&p.right==null){
    		return p;
    	}
    	TreeNode2 temp=p.left;
    	p.left=p.right;
    	p.right=temp;
    	if(p.left!=null){
    		p.left=fun(p.left);
    	}
    	if(p.right!=null){
    		p.right=fun(p.right);
    	}
    	return p;
    }
}
class TreeNode2{
	int value;
	TreeNode2 left;
	TreeNode2 right;
	TreeNode2(int value){
		this.value=value;
	}
}