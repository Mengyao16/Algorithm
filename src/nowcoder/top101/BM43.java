package Algorithm.nowcoder.top101;

import java.util.Stack;

public class BM43 {
    //包含min函数的栈
    //leetcode 剑指offer30
    Stack<Integer> s ;
    Stack<Integer> min ;

    public static void main(String[] args) {
        BM43 a = new BM43();
        a.push(-2);
        a.push(0);
        a.push(-3);
        int min = a.min();
        a.pop();
        a.top();
        min = a.min();
        return ;
    }
    public BM43(){
        s = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);

    }
    public void push(int x){
        s.push(x);
        if(x<min.peek()) min.push(x);
        else min.push(min.peek());

    }
    public void pop(){
        s.pop();
        min.pop();

    }
    public int top(){
        return s.peek();

    }
    public int min(){
        return min.peek();

    }
}
