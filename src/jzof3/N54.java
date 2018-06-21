package jzof3;

public class N54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode r1=new TreeNode(5);
		TreeNode r2=new TreeNode(3);
		TreeNode r3=new TreeNode(7);
		TreeNode r4=new TreeNode(2);
		TreeNode r5=new TreeNode(4);
		TreeNode r6=new TreeNode(6);
		TreeNode r7=new TreeNode(8);
		r1.left=r2;
		r1.right=r3;
		r2.left=r4;
		r2.right=r5;
		r3.left=r6;
		r3.right=r7;
		int []k=new int[1];
		solve(r1,k,3);
	}
    public static void solve(TreeNode r,int []k,int target){
    	if(r!=null){
    		solve(r.left,k,target);
        	k[0]++;
        	if(target==k[0]){
        		System.out.println(r.value);
        		return;
        	}
        	solve(r.right,k,target);
    	}
    }
}
