package Algorithm.nowcoder.top101;
import java.util.ArrayList;
import java.util.List;
public class BM60 {
    //括号生成
    //leetcode 22

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n){

        dfs("",0,0,n);
        return res;


    }
    public void dfs(String paths,int left,int right ,int n){
        if(left>n||right>left) return;
        if(paths.length()==n*2) {
            res.add(paths);
            return ;
        }
        dfs(paths+"(",left+1,right,n);
        dfs(paths+")",left ,right+1,n);

    }


}
