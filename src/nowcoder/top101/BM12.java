package Algorithm.nowcoder.top101;

import Algorithm.structure.ListNode;

public class BM12 {
    //单链表的排序
    public ListNode sortList(ListNode head){

        return sortList(head,null);
    }

    public ListNode sortList(ListNode head,ListNode tail){
        if(head==null) return head;
        if(head.next==tail){
            head.next = null;
            return head;
        }


        //寻找list中点位置
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=tail){
            fast = fast.next;
            slow = slow.next;
            if(fast!=tail){
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1  = sortList(head,mid);
        ListNode list2  = sortList(mid,tail);
        ListNode sorted = merge(list1,list2);
        return sorted;

    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode,temp1 = head1,temp2 = head2;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp.next = temp1 != null?temp1:temp2;
        return dummyNode.next;
    }
}
