package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;

public class BM03 {
    //k个一组反转链表
    public ListNode reverseKGroup (ListNode head, int k) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode tail = pre;
        for (int i = 0; i < k; i++) {
            tail = tail.next;
            if(tail == null){
                return head;
            }
        }
        ListNode newHead  = tail.next;
        ListNode[] result = reverse(head,tail);
        head = result[0];
        tail = result[1];
        tail.next = reverseKGroup(newHead,k);
        return head;
    }
    public ListNode[] reverse(ListNode head,ListNode tail){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode cur = head;
        while(pre!=tail){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return new ListNode[] {tail,head};
    }
}
