package jzof;

import java.util.LinkedList;
import java.util.List;



public class N32 {

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
		PrintFromTopToBottom(n1);

	}
	public static void PrintFromTopToBottom(TreeNode2 r){
		if(r==null){
			return;
		}
		List list=new LinkedList();
		list.add(r);
		while(!list.isEmpty()){
			TreeNode2 temp=(TreeNode2) list.get(0);
			list.remove(0);
			System.out.print(temp.value+" ");
			if(temp.left!=null){
				list.add(temp.left);
			}
			if(temp.right!=null){
				list.add(temp.right);
			}
			
		}
	}

}
