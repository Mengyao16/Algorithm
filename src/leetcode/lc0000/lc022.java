package Algorithm.leetcode.lc0000;

import java.util.LinkedList;
import java.util.List;

public class lc022 {
    private List<String> res = new LinkedList<>();
    public List<String> generateParenthesis(int n) {

        dfs(n,0,0,new StringBuffer());
        return res;
    }
    public void dfs(int n,int left,int right ,StringBuffer sb){
        if(left==n&&right==n){
            res.add(sb.toString());
            return ;
        }
        if(left<n){
            sb.append('(');
            dfs(n,left+1,right,sb);
            sb.deleteCharAt(left+right);
        }
        if(right<left){
            sb.append(')');
            dfs(n,left,right+1,sb);
            sb.deleteCharAt(left+right);
        }
    }
}
