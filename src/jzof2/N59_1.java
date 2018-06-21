package jzof2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N59_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N59_1 n59=new N59_1();
		int []nums={2,3,4,2,6,2,5,1};
		System.out.println(n59.max(nums,3));
	}
	public ArrayList<Integer> max(int []nums,int size){
		if(nums==null||nums.length==0){
			return null;
		}
		ArrayList<Integer> res=new ArrayList<Integer>();
		ArrayList<Integer> index=new ArrayList<Integer>();
		for(int i=0;i<size;i++){
			while(!index.isEmpty()&&nums[i]>=nums[index.get(index.size()-1)]){
				index.remove(index.size()-1);
			}
			//System.out.println();
			index.add(i);
		}
		for(int i=size;i<nums.length;i++){
			res.add(nums[index.get(0)]);
			while(!index.isEmpty()&&nums[i]>=nums[index.get(index.size()-1)]){
				index.remove(index.size()-1);
			}
			if(!index.isEmpty()&&index.get(0)<=(i-size)){
				index.remove(0);
			}
			index.add(i);
		}
		res.add(nums[index.get(0)]);
		return res;
	}
}
