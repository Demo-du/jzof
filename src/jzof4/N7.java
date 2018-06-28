package jzof4;

public class N7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []qian= {1,2,4,7,3,5,6,8};
        int []zhong= {4,7,2,1,5,3,8,6};
        N7 n7=new N7();
        TreeNode r=n7.con(qian, 0, qian.length-1, zhong, 0, zhong.length-1);
        //System.out.println(r.left.value);
        n7.mid(r);
	}
    TreeNode con(int qian[],int p1,int r1,int []zhong,int p2,int r2) {
    	if(p1<=r1&&p2<=r2) {
    		int root=qian[p1];
        	TreeNode r=new TreeNode(root);
        	int mid2=0;
        	for(int i=p2;i<=r2;i++) {
        		if(zhong[i]==root) {
        			mid2=i;
        			//System.out.println(mid2);
        			break;
        		}
        	}
        	r.left=con(qian,p1+1,mid2-p2+p1,zhong,p2,mid2-1);
        	r.right=con(qian,mid2-p2+p1+1,r1,zhong,mid2+1,r2);
        	return r;
    	}
    	return null;
    }
    public void mid(TreeNode r){
    	if(r!=null) {
    		mid(r.left);
    		System.out.println(r.value);
    		mid(r.right);
    	}
    }
}
