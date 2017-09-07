package jzof;

import java.util.Stack;

public class N9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
	}

}
class CQueue{
	//定义两个栈
	private Stack<Object> stack1=new Stack<Object>();
	private Stack<Object> stack2=new Stack<Object>();
	public void appendTail(Object item){
		stack1.push(item);
	}
	public Object deleteHead(){
		if(stack2.size()==0){
			while(stack1.size()!=0){//stack1不为空
				Object temp=stack1.pop();
				stack2.add(temp);
			}
		}
		if(stack2.size()==0){
			throw new RuntimeException("No more element.");
		}
		return stack2.pop();
	}
}
