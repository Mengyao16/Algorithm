package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;



public class BM01 {
    public static void main(String[] args) {
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        first.next = second;
        second.next = third;
        ListNode reverse = reverseList(first);
        while(reverse!=null){
            System.out.println(reverse.val);
            reverse = reverse.next;
        }

    }

    //非递归写法

    public static ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;

    }

}
