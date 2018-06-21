package jzof3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeNode r1=new TreeNode(10);
         TreeNode r2=new TreeNode(5);
         TreeNode r3=new TreeNode(12);
         TreeNode r4=new TreeNode(4);
         TreeNode r5=new TreeNode(7);
         r1.left=r2;
         r1.right=r3;
         r2.left=r4;
         r2.right=r5;
         List<Integer> path=new LinkedList<Integer>();
         chazhao(22,r1,0,path);
	}
    public static void  chazhao(int target,TreeNode r,int sum,List<Integer> path){
    	if(r==null){
    		return;
    	}
    	sum+=r.value;
    	path.add(r.value);
    	boolean isleaf=(r.left==null)&&(r.right==null);
    	if(sum==target&&isleaf){
    		System.out.println(path);
    	}
        {
    		if(r.left!=null){
    			chazhao(target,r.left,sum,path);
    		}
    		if(r.right!=null){
    			chazhao(target,r.right,sum,path);
    		}
    	}
    	path.remove(path.size()-1);
    }
}
