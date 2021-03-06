package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;

public class BM06 {
    //判断链表是否有环
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null&&fast.next!=null){

            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }

        }
        return false;

    }
}
