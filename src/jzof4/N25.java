package jzof4;

/**
 * Created by Administrator on 2018\7\26 0026.
 */
public class N25 {
    public static void main(String[] args) {

    }
    public static ListNode merge(ListNode p1,ListNode p2){
        if(p1==null){
            return p2;
        }
        if(p2==null){
            return p1;
        }
        ListNode tmp;
        if (p1.value<p2.value){
            tmp=p1;
            tmp.next=merge(p1.next,p2);
        }else {
            tmp=p2;
            tmp.next=merge(p1,p2.next);
        }
        return tmp;
    }
}
