package jzof2;

import java.util.Stack;

public class N31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []num1={1,2,3,4,5};
        int []num2={4,5,3,2,1};
        int []num3={4,3,5,1,2};
        N31 n31=new N31();
        System.out.println(n31.IsPopOrder(num1, num2));
        System.out.println(n31.IsPopOrder(num1, num3));
	}
	public boolean IsPopOrder(int []pPush,int [] pPop){
		if(pPush.length==0&&pPop.length==0){
    		return true;
    	}
    	if(pPush.length!=pPop.length){
    		return false;
    	}
    	int index_pop=0;
    	int index_push=0;
    	Stack<Integer> stack=new Stack<Integer>();
    	while(index_pop<pPop.length){
    		while(stack.isEmpty()||stack.peek()!=pPop[index_pop]){
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
