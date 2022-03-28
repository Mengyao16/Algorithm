package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;
import java.util.HashSet;

public class BM07 {
    public ListNode detectCycle(ListNode head){
        HashSet<ListNode> map = new HashSet<>();
        while(head!=null){
            if(map.contains(head)){
                return head;
            }else{
                map.add(head);
            }
            head = head.next;
        }
        return null;
    }
    /*
    public ListNode detectCycle(ListNode head ){
        ListNode fast = head ;
        ListNode slow = head ;
        while(true){
            if(fast==null||fast.next==null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) break;
        }
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }*/
}
