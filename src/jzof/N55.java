package jzof;

public class N55 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode2 n1=new TreeNode2(1);
		TreeNode2 n2=new TreeNode2(2);
		TreeNode2 n3=new TreeNode2(3);
		TreeNode2 n4=new TreeNode2(4);
		TreeNode2 n5=new TreeNode2(5);
		TreeNode2 n6=new TreeNode2(7);
		TreeNode2 n7=new TreeNode2(7);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n5.left=n7;
		n3.right=n6;
		N55 n55=new N55();
		System.out.println(n55.TreeDepth(n1));
		System.out.println(n55.IsBalanced(n1));
	}
	public int TreeDepth(TreeNode2 r){//二叉树深度
		if(r==null){
			return 0;
		}
		int d_left=TreeDepth(r.left);
		int d_right=TreeDepth(r.right);
		return (d_left>d_right)?(d_left+1):(d_right+1);
	}
    public boolean IsBalanced(TreeNode2 r,int[]Depth){
    	if(r==null){
    		return true;
    	}
    	int []left=new int[1];
    	int []right=new int[1];
    	if(IsBalanced(r.left,left)&&IsBalanced(r.right,right)){
    		int dis=left[0]-right[0];
    		if(dis<=1&&dis>=-1){
    			Depth[0]=(left[0]>right[0])?left[0]:right[0]+1;
    			return true;
    		}
    	}
    	return false;
    } 
    public boolean IsBalanced(TreeNode2 r){
    	int []depth=new int[1];
    	return IsBalanced(r,depth);
    }
}
