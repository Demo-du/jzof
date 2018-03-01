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
		int []k={0};
		N55 n55=new N55();
		System.out.println(n55.getdep(n1));
		System.out.println(n55.isbalenced(n1, k));
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
    public boolean isbalenced(TreeNode r,int[]dep){
    	if(r==null){
    		dep[0]=0;
    		return true;
    	}
    	int[] dl={0};
    	int []dr={0};
    	if(isbalenced(r.left,dl)&&isbalenced(r.right,dr)){
    		int dif=dl[0]-dr[0];
    		if(dif<=1&&dif>=-1){
    			dep[0]=1+(dl[0]>dr[0]?dl[0]:dr[0]);
    			return true;
    		}
    	}
    	return false;
    }
}
