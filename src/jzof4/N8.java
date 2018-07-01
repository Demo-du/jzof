package jzof4;


public class N8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static pBinaryTreeNode solve(pBinaryTreeNode r) {
    	if(r==null) {
    		return null;
    	}
    	if(r.right!=null) {
    		pBinaryTreeNode tmp=r.right;
    		while(tmp.left!=null) {
    			tmp=tmp.left;
    		}
    		return tmp;
    	}
    	if(r.parent!=null) {
    		if(r==r.parent.left) {
    			return r.parent;
    		}
    		if(r==r.parent.right) {
    			pBinaryTreeNode tmp=r;
    			while(r.parent!=null) {
    				r=r.parent;
    				if(r==r.parent.left) {
    					return r.parent;
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