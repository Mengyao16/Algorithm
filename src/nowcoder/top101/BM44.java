package Algorithm.nowcoder.top101;

import java.util.Stack;

public class BM44 {
    //有效括号序列
    //leetcode 20
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s){
        if(s.length()%2 !=0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case '(':stack.push('('); break;
                case '[':stack.push('['); break;
                case '{':stack.push('{'); break;
                case ')':if(stack.isEmpty()||stack.pop()!='(') return false; break;
                case ']':if(stack.isEmpty()||stack.pop()!='[') return false; break;
                case '}':if(stack.isEmpty()||stack.pop()!='{') return false; break;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;

    }
}
