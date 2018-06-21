package jzof;

import java.util.Stack;

public class N6 {
    public static void print(Node root) {
    	Stack<Node> st=new Stack<Node>();
    	while(root!=null) {
    		st.push(root);
    		root=root.next;
    	}
    	Node tmp;
    	while(!st.empty()) {
    		tmp=st.pop();
    		System.out.println(tmp.value);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
        root.value = 1;
        root.next = new Node();
        root.next.value = 2;
        root.next.next = new Node();
        root.next.next.value = 3;
        root.next.next.next = new Node();
        root.next.next.next.value = 4;
        root.next.next.next.next = new Node();
        root.next.next.next.next.value = 5;
        print(root);
	}

}
class Node{
	int value;
	Node next;
}