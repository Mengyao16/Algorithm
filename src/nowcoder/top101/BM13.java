package Algorithm.nowcoder.top101;

import Algorithm.structure.ListNode;

public class BM13 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        head.next = node;
        System.out.println(isPalindrome( head));
    }
    //判断链表是否是回文结构
    //leetcode234 回文链表
    public static boolean isPalindrome(ListNode head){
        if(head ==null||head.next==null) return true;
        ListNode slow = head ,fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        int oddeven = 0;
        if(fast.next!=null){
            oddeven = 1;
        }
        ListNode rightHead = slow.next;
        ListNode[] reverseRe = reverse(head,slow);
        ListNode leftHead = new ListNode(-1);
        if(oddeven == 1){
            leftHead = reverseRe[0];
        }else{
            leftHead = reverseRe[0].next;
        }
        while(rightHead!=null&&leftHead!=null){
            if(rightHead.val!=leftHead.val){
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }
        return true;


    }
    public static ListNode[] reverse(ListNode head,ListNode tail){
        ListNode pre = null;
        ListNode cur = head;
        while(pre!=tail){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return new ListNode[]{tail,head};
    }

}
