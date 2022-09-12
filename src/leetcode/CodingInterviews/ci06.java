package Algorithm.leetcode.CodingInterviews;

import Algorithm.structure.ListNode;


import java.util.LinkedList;

public class ci06 {
    //从尾到头打印链表
    public int[] reversePrint(ListNode head){

        LinkedList<ListNode> stack = new LinkedList<>();
        while(head!=null){
            stack.push(head);
            head = head.next;
        }
        int size = stack.size();

        int[] res = new int[stack.size()];
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop().val;
        }

        return res;

    }
    public int[] reversePrint2(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int[] res = new int[count];
        temp = head;
        for (int i = count-1; i >= 0 ; i--) {
            res[i] = temp.val;
            temp = temp.next;
        }
        return res;
    }


}
