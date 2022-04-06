package Algorithm.nowcoder.top101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BM58 {
    //字符串的排列
    //leetcode 剑指offer38
    List<String> res = new ArrayList<>();
    char[] chars;

    public String[] permutation(String s){
        chars = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);


    }
    public void dfs(int x){
        if(x== chars.length-1){
            res.add(String.valueOf(chars));
        }
        HashSet<Character> set = new HashSet<>();


        for (int i = x; i < chars.length; i++) {
            if(set.contains(chars[i])){
                continue;
            }
            set.add(chars[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);

        }
    }
    void swap(int a,int b){
        char tmp = chars[a];
        chars[a] = chars[b];
        chars[b] = tmp;
    }
}
