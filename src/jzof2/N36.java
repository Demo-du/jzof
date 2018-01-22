package jzof2;


public class N36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1=new TreeNode(10);
		TreeNode n2=new TreeNode(6);
		TreeNode n3=new TreeNode(14);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(8);
		TreeNode n6=new TreeNode(12);
		TreeNode n7=new TreeNode(16);
		n1.right=n3;
		n1.left=n2;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		N36 n36=new N36();
		TreeNode ceshi=n36.convert(n1);
		System.out.println(ceshi.value);
		while(ceshi!=null)
		{
			System.out.print(ceshi.value+" ");
			ceshi=ceshi.right;
		}
	}
    public TreeNode convert(TreeNode r){
    	if(r==null){
    		return null;
    	}
    	TreeNode []last=new TreeNode[1];//null;
    	ConvertNode(r,last);
    	while(r!=null&&r.left!=null){
    		r=r.left;
    	}
    	return r;
    }
    public void ConvertNode(TreeNode r,TreeNode []last){
    	if(r==null){
    		return;
    	}
    	TreeNode current=r;
    	if(r.left!=null){
    		ConvertNode(r.left,last);
    	}
    	current.left=last[0];
    	if(last[0]!=null){
    		last[0].right=current;
    	}
    	last[0]=current;
    	if(current.right!=null){
    		ConvertNode(r.right,last);
    	}
    }
}
