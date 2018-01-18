package jzof2;

import java.util.Stack;


public class N32_3 {

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
    		return;
    	}
    	Stack<TreeNode> []level=new Stack[2];
		level[0]=new Stack<TreeNode>();
		level[1]=new Stack<TreeNode>();
		int current=0;
		int next=1;
		level[0].push(r);
		while(!level[0].isEmpty()||!level[1].isEmpty()){
			TreeNode tmp=level[current].pop();
			System.out.print(tmp.value+" ");
			if(current==0){
				if(tmp.left!=null){
					level[next].push(tmp.left);
				}
				if(tmp.right!=null){
					level[next].push(tmp.right);
				}
			}else{
				if(tmp.right!=null){
					level[next].push(tmp.right);
				}
				if(tmp.left!=null){
					level[next].push(tmp.left);
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
