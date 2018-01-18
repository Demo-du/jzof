package jzof2;

import java.util.LinkedList;
import java.util.List;

public class N32_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1=new TreeNode(8);
		TreeNode n2=new TreeNode(6);
		TreeNode n3=new TreeNode(10);
		TreeNode n4=new TreeNode(5);
		TreeNode n5=new TreeNode(7);
		TreeNode n6=new TreeNode(9);
		TreeNode n7=new TreeNode(11);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		Print(n1);
	}
    public static void Print(TreeNode r){
    	if(r==null){
    		return ;
    	}
    	List<TreeNode> list=new LinkedList<TreeNode>();
    	list.add(r);
    	int tobe=1;
    	int nextlevel=0;
    	while(!list.isEmpty()){
    		TreeNode tmp=list.get(0);
    		list.remove(0);
    		System.out.print(tmp.value+" ");
    		if(tmp.left!=null){
    			list.add(tmp.left);
    			nextlevel++;
    		}
    		if(tmp.right!=null){
    			list.add(tmp.right);
    			nextlevel++;
    		}
    		tobe--;
    		if(tobe==0){
    			System.out.println();
    			tobe=nextlevel;
    			nextlevel=0;
    		}
    	}
    }
}
