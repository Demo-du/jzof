package jzof2;

import java.util.Stack;

public class N6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		N6 n6=new N6();
		n6.Print(n1);
	}
    public  void Print(ListNode root){
    	if(root!=null){
    		if(root.next!=null){
    			Print(root.next);	
    		}
    		System.out.print(root.value);
    	}
    	
    }
}
class ListNode{
	int value;
	ListNode next;
	public ListNode(){
		
	}
    public ListNode(int value){
		this.value=value;
	}
}
