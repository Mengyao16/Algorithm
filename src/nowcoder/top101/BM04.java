package Algorithm.nowcoder.top101;
import Algorithm.structure.ListNode;
public class BM04 {
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode dummyNode = new ListNode(-1);
        ListNode pre =dummyNode;

        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                pre.next = list1;
                list1 = list1.next;

            }
            else{
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1==null?list2:list1;
        return dummyNode.next;
    }
    /*
    public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
        if(list1==null || list2==null){
            return list1==null?list2:list1;
        }
        ListNode dummyNode = new ListNode(-1);

        if(list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;

        }
        else{
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;

        }



    }

     */

}
