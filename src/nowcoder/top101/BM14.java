package Algorithm.nowcoder.top101;

import Algorithm.structure.ListNode;

public class BM14 {
    //leetcode 328
    //链表的奇偶重排
    public ListNode oddEvenList(ListNode head){
        if(head==null||head.next==null||head.next.next==null) return head;
        ListNode evenHead = head.next;
        ListNode odd = head;
        ListNode even = head.next;
        while( even!=null&& even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;


        }
        odd.next = evenHead;
        return head;


    }

}
