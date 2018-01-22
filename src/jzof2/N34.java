package jzof2;

import java.util.LinkedList;
import java.util.List;

public class N34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void find(TreeNode r,int exp){
		if(r==null){
			return ;
		}
		List<Integer> path=new LinkedList<Integer>();
		int currentSum=0;
		find(r,exp,path,currentSum);
	}
	public void find(TreeNode r,int exp,List<Integer> path,int currentSum){
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
