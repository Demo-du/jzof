package jzof;

import java.util.Stack;

public class N32_3 {

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
		Stack<TreeNode2> []level=new Stack[2];
		level[0]=new Stack<TreeNode2>();
		level[1]=new Stack<TreeNode2>();
		int current=0;
		int next=1;
		level[0].push(r);
		while(!level[0].isEmpty()||!level[1].isEmpty()){
			TreeNode2 temp=level[current].pop();
			System.out.print(temp.value);
			if(current==0){//奇数层
				if(temp.left!=null){
					level[next].push(temp.left);
				}
				if(temp.right!=null){
					level[next].push(temp.right);
				}
			}else{
				if(temp.right!=null){
					level[next].push(temp.right);
				}
				if(temp.left!=null){
					level[next].push(temp.left);
				}
			}
			if(level[current].isEmpty()){
				System.out.println();
				current=1-current;
				next=1-next;
			}
		}
	}

}
