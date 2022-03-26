package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode ;

public class BM02 {

    //切断的方法
    public ListNode reverseBetween(ListNode head,int left ,int right){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre_left = dummyNode;
        for (int i = 0; i < left-1; i++) {
            pre_left = pre_left.next;
        }
        ListNode cur = pre_left.next;
        for (int i = 0; i < right - left; i++) {
            cur = cur.next;
        }
        ListNode nextRight = cur.next;
        cur.next = null;
        ListNode first = reverse(pre_left.next);
        pre_left.next.next = nextRight;
        pre_left.next = first;
        return dummyNode.next;

    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    //第二种方法
    public ListNode reverseBetween2(ListNode head, int left, int right){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode preFirst = dummyNode;
        for (int i = 0; i < left-1; i++) {
            preFirst = preFirst.next;
        }
        ListNode last = preFirst.next;
        ListNode cur = last.next;

        for (int i = 0; i < left-right-1; i++) {
            ListNode next = preFirst.next;
            preFirst.next = cur;
            last.next = cur.next;
            cur.next = next;
            cur = last.next;

        }

        return dummyNode.next;
    }
}
