package jzof;

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
		System.out.println(HasSubtree(n1,n8));

	}
    public static boolean HasSubtree(TreeNode r1,TreeNode r2){//找节点相同的部分
    	boolean res=false;
    	if(r1!=null&&r2!=null){
	    	if(Equal(r1.value,r2.value)){
	    		System.out.println(r1.value);
	    		res=contain(r1,r2);
	    	}
	    	if(!res){
	    		res=HasSubtree(r1.left,r2);
	    	}
	    	if(!res){
	    		res=HasSubtree(r1.right,r2);
	    	}
    	}
    	return res;
    }
    public static boolean contain(TreeNode r1,TreeNode r2){
    	if(r2==null){
    		return true;
    	}
    	if(r1==null){
    		return false;
    	}

    	if(!Equal(r1.value,r2.value)){
    		System.out.println(r1.value+" "+r2.value);
    		return false;
    	}
    	return contain(r1.left,r2.left)&&contain(r1.right,r2.right);
    }
    public static boolean Equal(double n1,double n2){
    	if((n1-n2>-0.0000001)&&(n1-n2<0.0000001)){
    		return true;
    	}else{
    		return false;
    	}
    }
}
