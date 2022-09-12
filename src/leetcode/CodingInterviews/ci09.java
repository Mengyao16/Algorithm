package Algorithm.leetcode.CodingInterviews;

import java.util.LinkedList;

public class ci09 {
    LinkedList<Integer> p;
    LinkedList<Integer> q;
    public ci09(){
        p = new LinkedList<>();
        q = new LinkedList<>();
    }
    public void appendTail(int value){
        p.push(value);
    }
    public int deleteHead(){
        if(q.isEmpty()){
            return -1;
        }
        while(!p.isEmpty()){
            q.push(p.pop());
        }
        return q.pop();
    }


}
