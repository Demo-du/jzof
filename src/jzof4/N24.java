package jzof4;

/**
 * Created by Administrator on 2018\7\25 0025.
 */
public class N24 {
    public static void main(String[] args) {

    }
    public static ListNode fanzhuan(ListNode r){
        ListNode rev=null;
        ListNode tmp=r;
        ListNode pre=null;
        while (tmp!=null){
            ListNode next=tmp.next;
            if(next==null){
                rev=tmp;
            }
            tmp.next=pre;
            pre=tmp;
            tmp=next;
        }
        return null;
    }
}
