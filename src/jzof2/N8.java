package jzof2;




public class N8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.print(search(root.left).value);
	}
    public static pBinaryTreeNode search(pBinaryTreeNode node){
    	if(node==null){
    		return null;
    	}
    	if(node.right!=null){
    		pBinaryTreeNode p=node.right;
    		while(p.left!=null){
    			p=p.left;
    		}
    		return p;
    	}
    	if(node.parent!=null){
    		if(node.parent.left!=null){
    			return node.parent;
    		}
    		if(node.parent.left==null){
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
}
class pBinaryTreeNode{
	int value;
	pBinaryTreeNode parent;
	pBinaryTreeNode left;
	pBinaryTreeNode right;
}