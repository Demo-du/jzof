package jzof;

public class N8 {
    public static pBinaryTreeNode searchnext(pBinaryTreeNode node){
    	if(node==null){
    		return null;
    	}
    	if(node.right!=null){//右子树不为空
    		pBinaryTreeNode tempnode=node.right;
    		while(tempnode.left!=null){
    			tempnode=tempnode.left;
    		}
    		return tempnode;
    	}
    	else if(node.parent!=null){//没有右子树
    		if(node==node.parent.left&&node!=null){//节点是左子树，则父子树就是下一个点
    			return node.parent;
    		}
    		
    		else if(node==node.parent.right&&node!=null){//节点是右子树，则向上遍历找一个为左子树的点，他的父子树就是下一个点
    			pBinaryTreeNode temp=null;
    			while(node.parent!=null){
    				node=node.parent;
    				if(node==node.parent.left){
    					return node.parent;
    				}
    			}
    		}
    	}
    	return null;
    }
	public static void main(String[] args) {
		pBinaryTreeNode root=new pBinaryTreeNode();
		root.value=1;
		root.left=new pBinaryTreeNode();
		root.left.value=2;
		root.left.parent=new pBinaryTreeNode();
		root.left.parent=root;
		root.right=new pBinaryTreeNode();
		root.right.value=3;
		root.right.parent=new pBinaryTreeNode();
		root.right.parent=root;
		root.left.left=new pBinaryTreeNode();
		root.left.left.value=4;
		root.left.left.parent=new pBinaryTreeNode();
		root.left.left.parent=root.left;
		root.left.right=new pBinaryTreeNode();
		root.left.right.value=5;
		root.left.right.parent=new pBinaryTreeNode();
		root.left.right.parent=root.left;
		System.out.print(searchnext(root.left).value);
	}

}
class pBinaryTreeNode{
	int value;
	pBinaryTreeNode parent;
	pBinaryTreeNode left;
	pBinaryTreeNode right;
}
