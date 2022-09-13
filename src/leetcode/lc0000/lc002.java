package Algorithm.leetcode.lc0000;

import Algorithm.structure.ListNode;

public class lc002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while(l1!=null||l2!=null||flag==1){
            int a = l1==null?0:l1.val;
            int b = l2==null?0:l2.val;
            int sum = a + b + flag;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            flag = sum / 10 ;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;

        }
        return pre.next;

    }
}
