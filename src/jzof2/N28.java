package jzof2;

public class N28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean issym(TreeNode r){
    	
    	return issym(r,r);
    }
    public boolean issym(TreeNode r1,TreeNode r2){
    	if(r1==null&&r2==null){
    		return true;
    	}
    	if(r1==null||r2==null){
    		return false;
    	}
    	if(r1.value!=r2.value){
    		return false;
    	}
    	return issym(r1.left,r2.right)&&issym(r1.right,r2.left);
    }
}
