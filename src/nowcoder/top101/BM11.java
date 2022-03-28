package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;
import java.util.LinkedList;

public class BM11 {
    //链表相加（二）
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        int flag = 0;
        while(l1!=null||l2!=null||flag !=0){
            int val1 = l1==null ?0:l1.val;
            int val2 = l2==null ?0:l2.val;
            int sum = val1+ val2+ flag;
            flag = sum>=10?1:0;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;

        }
        return dummyNode.next;

    }

}
