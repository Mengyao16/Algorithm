package Algorithm.leetcode;

import Algorithm.structure.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class lc023 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode ;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(o->o.val));
        for(ListNode node :lists){
            if(node !=null){
                pq.offer(node);
            }
        }
        while(!pq.isEmpty()){
            ListNode poll = pq.poll();
            cur.next = poll;
            cur = cur.next;
            if(poll.next!=null){
                pq.offer(poll.next);
            }
        }
        return dummyNode.next;

    }
}
