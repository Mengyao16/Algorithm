package Algorithm.leetcode;

import java.util.HashMap;

public class lc003 {
    /*
    输入: s = "abcabcbb"
    输出: 3
    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int res = 0;
        for (int right = 0; right < s.length(); right++) {
            char tmp = s.charAt(right);
            if(map.containsKey(tmp)){
                left  = Math.max(map.get(tmp)+1,left);

            }
            map.put(tmp,right);
            res = Math.max(res,right - left +1);

        }
        return res;

    }
}
