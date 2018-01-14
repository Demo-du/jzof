package jzof2;

import java.util.Stack;

public class N30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static class StackWithMin<T extends Comparable<T>>{
		// 数据栈，用于存放插入的数据
        private Stack<T> dataStack;
        // 最小数位置栈，存放数据栈中最小的数的位置
        private Stack<T> minStack;

        // 构造函数
        public StackWithMin() {
            this.dataStack = new Stack<>();
            this.minStack = new Stack<>();
        }
        public T pop() {
            if (dataStack.isEmpty()) {
                System.out.println("已经空了");
                return null;
            }
            minStack.pop();
            return dataStack.pop();
        }
        public void push(T t) {
            // 如果入栈的元素为空就抛出异常
            if (t == null) {
                throw new RuntimeException("Element can be null");
            }
            dataStack.push(t);
            if(minStack.isEmpty()||t.compareTo(minStack.peek())<0){
            	minStack.push(t);
            }
            // 如果数据栈中有数据
            else {
            	minStack.push(minStack.peek());
            }
        }
        
        public T min() {
            // 如果最小数公位置栈已经为空（数据栈中已经没有数据了），则抛出异常
            if (minStack.isEmpty()) {
                throw new RuntimeException("No element in stack.");
            }

            // 获取数据栈中的最小元素，并且返回结果
            return minStack.peek();
        }
	}
}
