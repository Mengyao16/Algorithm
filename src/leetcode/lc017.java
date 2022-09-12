package Algorithm.leetcode;

import java.util.LinkedList;
import java.util.List;

public class lc017 {
    private final  String[] letters = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        if(digits.length()>0){
            dfs(digits,0,new StringBuffer(),res);

        }
        return res;
    }
    public void dfs(String digits,int index ,StringBuffer sb,List<String> res){

        if(index==digits.length()){
            res.add(sb.toString());
            return ;
        }
        String letter = letters[digits.charAt(index) -'2'];
        for(int i = 0;i<letter.length();i++){
            sb.append(letter.charAt(i));
            dfs(digits,index+1,sb,res);
            sb.deleteCharAt(index);

        }
    }
}
