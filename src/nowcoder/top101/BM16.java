package Algorithm.nowcoder.top101;

import Algorithm.structure.ListNode;

public class BM16 {
    //删除有序链表中的重复元素II
    //leetcode 82
    public ListNode deleteDuplicates(ListNode head){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode cur = dummyNode;
        while(cur.next !=null&&cur.next.next!=null){
            if(cur.next.val == cur.next.next.val){
                int x = cur.next.val;
                while(cur.next!=null&&cur.next.val==x){//注意&&前后顺序，如果改变会报错
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }

        }
        return dummyNode.next;
    }


}
