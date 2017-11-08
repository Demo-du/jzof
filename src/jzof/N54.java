package jzof;

public class N54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N54 n54=new N54();
        TreeNode2 n1=new TreeNode2(5);
        TreeNode2 n2=new TreeNode2(3);
        TreeNode2 n3=new TreeNode2(7);
        TreeNode2 n4=new TreeNode2(2);
        TreeNode2 n5=new TreeNode2(4);
        TreeNode2 n6=new TreeNode2(6);
        TreeNode2 n7=new TreeNode2(8);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        TreeNode2 res=n54.KthNode(n1, 3);
        System.out.println(res.value);
        
	}
    TreeNode2 KthNode(TreeNode2 r,int k){
    	if(r==null|k==0){
    		return null;
    	}
    	int [] k1=new int[1];
    	k1[0]=k;
    	return KthNodeCore(r,k1);
    }
    TreeNode2 KthNodeCore(TreeNode2 r,int []k){
    	TreeNode2 target=null;
    	if(r.left!=null){
    		target=KthNodeCore(r.left,k);
    	}
    	if(target==null){//左边没有符合要求的(左边k不等与1)
    		if(k[0]==1){
    			return r;
    		}
    		k[0]--;
    	}
    	if(target==null&&r.right!=null){
    		target=KthNodeCore(r.right,k);
    	}
    	return target;
    	
    }
}
