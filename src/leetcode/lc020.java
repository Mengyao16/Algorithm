package Algorithm.leetcode;

import java.util.LinkedList;

public class lc020 {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();

        for(char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char p = stack.pop();
                if(c==')'&&p!='('){
                    return false;
                }
                if(c==']'&&p!='['){
                    return false;
                }
                if(c=='}'&&p!='{'){
                    return false;
                }
            }
        }

        //栈必须为空
        return stack.isEmpty();


    }
}
