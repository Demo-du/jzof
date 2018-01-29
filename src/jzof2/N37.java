package jzof2;


public class N37 {

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
		N37 n37=new N37();
		String ss="124$$$35$$6$$";
		int []index={0};
		n37.Seri(n37.Deseri(ss.toCharArray(), index));
	}
    public void Seri(TreeNode r){
    	if(r==null){
    		System.out.print("$");
    		return;
    	}
    	System.out.print(r.value);
    	Seri(r.left);
    	Seri(r.right);
    }
    public TreeNode Deseri(char []str,int[] index){
    	TreeNode r=null;
    	if(index[0]<str.length){
    		if(str[index[0]]!='$'){
    			r=new TreeNode(str[index[0]]-'0');
    			index[0]+=1;
    			r.left=Deseri(str,index);
    			index[0]+=1;
    			r.right=Deseri(str,index);
    		}
    	}
    	return r;
    }
}
