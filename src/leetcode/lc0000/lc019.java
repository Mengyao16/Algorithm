package Algorithm.leetcode.lc0000;

import Algorithm.structure.ListNode;

public class lc019 {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode cur = dummyNode;
        for(int i = 0;i<=n;i++){
            cur = cur.next;
        }
        while(cur!=null){
            pre = pre.next;
            cur = cur.next;
        }
        if(pre.next != null){
            pre.next = pre.next.next;
        }
        return dummyNode.next;

    }
}
