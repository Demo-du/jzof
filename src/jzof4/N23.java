package jzof4;

/**
 * Created by Administrator on 2018\7\24 0024.
 */
public class N23 {
    public static void main(String[] args) {
        ListNode r1=new ListNode(1);
        ListNode r2=new ListNode(2);
        ListNode r3=new ListNode(3);
        ListNode r4=new ListNode(4);
        ListNode r5=new ListNode(5);
        ListNode r6=new ListNode(6);
        r1.next=r2;
        r2.next=r3;
        r3.next=r4;
        r4.next=r5;
        r5.next=r6;
        r6.next=r3;
        solve(r1);
    }
    public static ListNode iscircle(ListNode r){
        ListNode pre=r;
        ListNode last=r.next;
        while (pre!=null&&last!=null){
            if(pre==last){
                return pre;
            }
            pre=pre.next;
            last=last.next;
            if(pre==null||last==null){
                return null;
            }
            if(pre==last){
                return pre;
            }
            last=last.next;
        }
        return null;
    }
    public static void solve(ListNode r){
        ListNode meet=iscircle(r);
        int cnt=1;
        ListNode nodeTmp=meet;
        while(nodeTmp.next!=meet){
            nodeTmp=nodeTmp.next;
            cnt++;
        }
        ListNode r1=r;
        ListNode r2=r;
        for(int i=0;i<cnt;i++){
            r1=r1.next;
        }
        while(r1!=r2){
            r1=r1.next;
            r2=r2.next;
        }
        System.out.println(r1.value);
    }
}
