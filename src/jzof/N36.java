package jzof;

public class N36 {

	/**
	 * @param args TreeNode2
	 * 注意，必须用数组，因为java引用传递的性质，last=current并不能修改原last的值
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode2 n1=new TreeNode2(10);
		TreeNode2 n2=new TreeNode2(6);
		TreeNode2 n3=new TreeNode2(14);
		TreeNode2 n4=new TreeNode2(4);
		TreeNode2 n5=new TreeNode2(8);
		TreeNode2 n6=new TreeNode2(12);
		TreeNode2 n7=new TreeNode2(16);
		n1.right=n3;
		n1.left=n2;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		N36 n36=new N36();
		TreeNode2 cc=new TreeNode2();
		TreeNode2 ceshi=n36.Convert(n1);
		while(ceshi!=null)
		{
			System.out.println(ceshi.value);
			ceshi=ceshi.right;
		}
		//System.out.println(n36.Convert(n1).value);

	}
	public TreeNode2 Convert(TreeNode2 root){
		TreeNode2 []last=new TreeNode2[1];
	//	last[0]=new TreeNode2();
		ConvertNode(root,last);
		TreeNode2 head=last[0];
		while(head.left!=null&&head!=null){
			head=head.left;
		}
		return head;
	}
	public void ConvertNode(TreeNode2 Node,TreeNode2 [] last){
		if(Node==null){
			return;
		}
		TreeNode2 current=Node;
		if(current.left!=null){
			ConvertNode(Node.left,last);
		}
		current.left=last[0];
		if(last[0]!=null){
			last[0].right=current;
		}
		last[0]=current;//防止出现右子树不存在
		if(current.right!=null){
			ConvertNode(current.right,last);
		}
	//	System.out.println(last.value);
	}
}
