package jzof;

public class N7 {
	public static BinaryTreeNode construct(int[] preorder, int[] inorder) {
        // 输入的合法性判断，两个数组都不能为空，并且都有数据，而且数据的数目相同
        if (preorder == null || inorder == null || preorder.length != inorder.length || inorder.length < 1) {
            return null;
        }

        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
	public static BinaryTreeNode construct(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
		//return null;
		if(ps>pe||is>ie) {
			return null;
		}
		int r_v=preorder[ps];//前序遍历第一个数就是根
		int index=is;//中序找root，start就是is
		//找到中序遍历中root的位置
		while(index<=ie&&inorder[index] !=r_v) {
			index++;
		}
		BinaryTreeNode node=new BinaryTreeNode();
		node.value=r_v;
		/*
		 * 关于左子树，重构时，前序，因为第一个是根，所以起点是ps+1,左子树长度是根据中序求出：index-is-1,
		 * 所以，终点是index-is-1+ps+1=index-is+ps。中序，起点仍然为is，终点为index-1（因为
		 * 终点在root前一个）
		 */
		node.left=construct(preorder,ps+1,index-is+ps,inorder,is,index-1);
		/*
		 * 关于右子树，重构时，前序，因为左子树终点index-is+ps，所以右子树起点要加一，终点pe。
		 * 中序，起点在root后加1,所以是index+1，终点是ie
		 */
		node.right=construct(preorder,index-is+ps+1,pe,inorder,index+1,ie);
		return node;
	}
	//中序遍历打印
	public static void print(BinaryTreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }else {
        	//System.out.print("ddddd");
        }

    }
	public static void main(String[] args) {
		int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = construct(preorder, inorder);
        print(root);
	}

}
class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
}