package jzof;

public class N23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a1=new ListNode(1);
		ListNode a2=new ListNode(2);
		ListNode a3=new ListNode(3);
		ListNode a4=new ListNode(4);
		ListNode a5=new ListNode(5);
		ListNode a6=new ListNode(6);
		a1.next=a2;
		a2.next=a3;
		a3.next=a4;
		a4.next=a5;
		a5.next=a6;
		a6.next=a3;
		System.out.println(EntryNodeOfLoop(a1).value);
	}
	public static ListNode EntryNodeOfLoop(ListNode head){
		if(head==null){
			return null;
		}
		ListNode meetingNode=MeetingNode(head);
		ListNode h1=meetingNode;
		int num=1;
		while(h1.next!=meetingNode){
			h1=h1.next;
			num++;
		}
		h1=head;
		for(int i=0;i<num;i++){
			h1=h1.next;
		}
		ListNode h2=head;
		while(h1!=h2){
			h1=h1.next;
			h2=h2.next;
		}
		return h1;
	}
    public static ListNode MeetingNode(ListNode head){//相遇节点
    	if(head==null){
    		return null;
    	}
    	ListNode slow=head.next;
    	if(slow==null){
    		return null;
    	}
    	ListNode fast=slow.next;
    	while(slow!=null&&fast!=null){
    		if(slow==fast){
    			return slow;
    		}
    		slow=slow.next;
    		fast=fast.next;
    		if(fast!=null){
    			fast=fast.next;
    		}
    	}
    	return null;
    }
}
