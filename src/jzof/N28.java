package jzof;

public class N28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode2 n1=new TreeNode2(8);
		TreeNode2 n2=new TreeNode2(6);
		TreeNode2 n3=new TreeNode2(6);
		TreeNode2 n4=new TreeNode2(5);
		TreeNode2 n5=new TreeNode2(7);
		TreeNode2 n6=new TreeNode2(7);
		TreeNode2 n7=new TreeNode2(0);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		System.out.println(check(n1));
	}
    public static boolean check(TreeNode2 r){
    	return check(r,r);
    }
    public static boolean check(TreeNode2 r1,TreeNode2 r2){
    	if(r1==null&&r2==null){
    		return true;
    	}
    	if(r1==null||r2==null){
    		return false;
    	}
    	if(r1.value!=r2.value){
    		return false;
    	}
    	return check(r1.left,r2.right)&&check(r1.right,r2.left);
    }
}
