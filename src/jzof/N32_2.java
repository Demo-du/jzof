package jzof;

import java.util.LinkedList;
import java.util.List;

public class N32_2 {

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
		Print(n1);

	}
	public static void Print(TreeNode2 r){
		
		if(r==null){
			return ;
		}
		List list=new LinkedList();
		list.add(r);
		int next=0;
		int tobe=1;
		while(!list.isEmpty()){
			TreeNode2 temp=(TreeNode2) list.get(0);
			System.out.print(temp.value+" ");
			if(temp.left!=null){
				next++;
				list.add(temp.left);
			}
			if(temp.right!=null){
				next++;
				list.add(temp.right);
			}
			list.remove(0);
			tobe--;
			if(tobe==0){
				System.out.println();
				tobe=next;
				next=0;
			}
		}
	}

}
