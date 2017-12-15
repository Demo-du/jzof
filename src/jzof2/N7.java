package jzof2;



public class N7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N7 n7=new N7();
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = n7.Construct(preorder, inorder);
        n7.print(root);
	}
	public BinaryTreeNode Construct(int[] preorder, int[] inorder){
		// 输入的合法性判断，两个数组都不能为空，并且都有数据，而且数据的数目相同
        if (preorder == null || inorder == null || preorder.length != inorder.length || inorder.length < 1) {
            return null;
        }
		return ConstructCore(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}
	public BinaryTreeNode ConstructCore(int[] preorder, int ps, int pe, int[] inorder, int is, int ie){
		if(ps>pe||is>ie) {
			return null;
		}
		int r_v=preorder[ps];
		int index=is;
		while(index<=ie&&inorder[index] !=r_v){
			index++;//中序遍历中根的位置
		}
		BinaryTreeNode r=new BinaryTreeNode();
		r.value=r_v;
		r.left=ConstructCore(preorder,ps+1,index-is+ps,inorder,is,index-1);
		r.right=ConstructCore(preorder,index-is+ps+1,pe,inorder,index+1,ie);
		return r;
	}
	public void print(BinaryTreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }else {
        	//System.out.print("ddddd");
        }

    }
}

class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
}