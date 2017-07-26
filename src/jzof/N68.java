package jzof;

public class N68 {

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
		N68 n68=new N68();
		System.out.println(n68.FindLowestParent(n1, n7, n6).value);
	}
    public TreeNode2 FindLowestParent(TreeNode2 r,TreeNode2 p,TreeNode2 q){
    	if(r==null||p==null||q==null){
    		return null;
    	}
    	TreeNode2 p1,p2;
    	if(p.value>q.value){
    		p1=p;
    		p2=q;
    	}else{
    		p1=q;
    		p2=p;
    	}
    	return FindCore(r,p1,p2);
    }
    public TreeNode2 FindCore(TreeNode2 r,TreeNode2 p1,TreeNode2 p2){
    	if(r.value>p1.value&&r.value>p2.value){
    		return FindCore(r.left,p1,p2);
    	}else if(r.value<p1.value&&r.value<p2.value){
    			return FindCore(r.right,p1,p2);
    	}else{
    		return r;
    	}
    }
}
