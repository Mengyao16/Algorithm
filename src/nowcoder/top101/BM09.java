package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;
import java.util.*;
public class BM09 {
    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        ListNode result = removeNthFromEnd(test,1);

    }
    public static ListNode removeNthFromEnd1(ListNode head,int n){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode cur = dummyNode;
        LinkedList<ListNode> stack = new LinkedList<>();
        while(cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();

        }
        ListNode pre = stack.peek();
        pre.next = pre.next.next;
        return dummyNode.next;
    }
    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;

    }
}
