package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;
public class BM08 {
    public ListNode getKthFromEnd(ListNode head, int k){
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k ;i++) {
            if(fast == null) return null;
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
