package Algorithm.nowcoder.top101;
import java.util.List;
import java.util.LinkedList;

public class BM42 {
    //用两个栈实现队列
    //leetcode 剑指offer09
    LinkedList<Integer> p;
    LinkedList<Integer> q;
    public BM42(){
        p = new LinkedList<>();
        q = new LinkedList<>();
    }
    public void appendTail(int value){
        p.push(value);
    }

    public int deleteHead(){
        if(q.isEmpty()){
            if(p.isEmpty()){
                return -1;
            }
            while(!p.isEmpty()){
                q.push(p.pop());
            }
        }
        return q.pop();

    }
}
