package jzof4;

/**
 * Created by Administrator on 2018\7\15 0015.
 */
public class N18 {
    public static void main(String []ars){

    }
    public static void solve(ListNode r,int tar){
        ListNode first=new ListNode();
        first.next=r;
        ListNode pre=first;
        ListNode next=r;
        while (next!=null&&next.value!=tar){
            next=next.next;
            pre=pre.next;
        }
        pre.next=next.next;
        next.next=null;
    }
}
