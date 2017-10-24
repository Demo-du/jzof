package jzof;

import java.util.LinkedList;
import java.util.List;

public class N34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode2 n1=new TreeNode2(10);
		TreeNode2 n2=new TreeNode2(5);
		TreeNode2 n3=new TreeNode2(12);
		TreeNode2 n4=new TreeNode2(4);
		TreeNode2 n5=new TreeNode2(7);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		N34 n34=new N34();
		n34.find(n1, 22);

	}
	public void find(TreeNode2 r,int exp){
		if(r==null){
			return ;
		}
		List<Integer> path=new LinkedList<Integer>();
		int currentSum=0;
		find(r,exp,path,currentSum);
	}
	public void find(TreeNode2 r,int exp,List<Integer> path,int currentSum){
		currentSum+=r.value;
		path.add(r.value);
		boolean isleaf=(r.left==null)&&(r.right==null);
		
	    if(currentSum==exp&&isleaf){
	    	System.out.print("有效路径为：");
	    	for(int i:path){
	    		System.out.print(i+" ");
	    	}
	    	System.out.println();
	    }
	    if(r.left!=null){
	    	find(r.left,exp,path,currentSum);
	    }
	    if(r.right!=null){
	    	find(r.right,exp,path,currentSum);
	    }
	    path.remove(path.size()-1);
	}

}
