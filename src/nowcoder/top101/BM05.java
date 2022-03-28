package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class BM05 {
    //合并k个已排序的链表
    public ListNode mergeKLists(ListNode[] lists){
        if(lists.length==0) return null;
        ListNode dummyNode= new ListNode(-1);
        ListNode cur = dummyNode;
        Queue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                return o1.val -o2.val;
            }
        });
        for (ListNode list:
             lists) {
            if(list == null) continue;
            pq.add(list);
        }
        while(!pq.isEmpty()){
            ListNode nextNode = pq.poll();
            cur.next = nextNode;
            cur = cur.next;
            if(nextNode.next!=null){
                pq.add(nextNode.next);
            }
        }
        return dummyNode.next;


    }
}
