package jzof4;

/**
 * Created by Administrator on 2018\7\23 0023.
 */
public class N22 {
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        solve(n1,2);
    }
    public static void solve(ListNode r,int k){
        int index=0;
        ListNode pre=r;
        while(pre!=null){
            pre=pre.next;
            index++;
            if(index>=k){
                break;
            }
        }
        if(index>k){
            System.out.println(-1);
            return;
        }
        ListNode last=r;
        while(pre!=null){
            pre=pre.next;
            last=last.next;
        }
        System.out.println(last.value);
    }
}
