package jzof;

public class N18 {

	/**
	 * 删除链表的节点
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode deleteDuplication(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode pre = null;
        ListNode cur = head;
        ListNode post = head.next;
        boolean needDelete = false;
        while (post!=null){
            if(cur.value==(post.value)){
                needDelete = true;
                post=post.next;
            }
            else if(needDelete && cur.value!=(post.value)){
                if(pre==null)
                    head = post;
                else
                    pre.next=post;
                cur = post;
                post = post.next;
                needDelete = false;
            }
            else{
                pre = cur;
                cur = post;
                post = post.next;
            }
        }
        if(needDelete && pre!=null)
            pre.next = null;
        else if(needDelete && pre==null)
            head = null;
        return head;

}
	public static void del1(ListNode n1,ListNode n2){//删除链表节点
		if(n1==null||n2==null){
			return ;
		}
		if(n2.next!=null){
			ListNode n3=n2.next;
			n2.value=n3.value;//将下一个节点复制过来
			n2.next=n3.next;//下一节点指向再下一节点，相当于下一节点被删除，本节点代替下一节点
		}else if(n1==n2){
			n1=null;
			n2=null;
		}else{
			ListNode n4=n1;
			while(n4.next!=n2){//没到最后
				n4=n4.next;
			}
			n4.next=null;
			n2=null;
		}
		
	}
    class ListNode{
    	int value;
    	ListNode next;
    }
}
