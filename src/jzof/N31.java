package jzof;

import java.util.Stack;

public class N31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1=new int []{1,2,3,4,5};
		int []nums2=new int []{4,5,3,2,1};
		int []nums3=new int []{4,3,5,1,2};
		System.out.println(IsPopOrder(nums1,nums3));

	}
    public static boolean IsPopOrder(int []pPush,int [] pPop){
    	if(pPush.length==0&&pPop.length==0){
    		return true;
    	}
    	if(pPush.length!=pPop.length){
    		return false;
    	}
    	boolean res=false;
    	int index_pop=0;
    	int index_push=0;
    	Stack<Integer> stack=new Stack<Integer>();
    	while(index_pop<pPop.length){
    		while(stack.isEmpty()||stack.peek()!=pPop[index_pop]){//压入备用栈
    			if(index_push>=pPush.length){
    				break;
    			}
    			stack.push(pPush[index_push]);
    			index_push++;
    			
    		}
    		if(stack.peek()!=pPop[index_pop]){
    			break;
    		}
    		stack.pop();
    		index_pop++;
    	}
    	if(index_pop>=pPop.length&&stack.isEmpty()){
    		return true;
    	}
    	return false;
    }
}
