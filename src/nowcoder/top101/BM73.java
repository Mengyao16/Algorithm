package Algorithm.nowcoder.top101;

import java.util.Arrays;

public class BM73 {
    //最长回文子串
    public String longestPalindrome(String s){
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int maxStart = 0;
        int maxEnd = 0;
        int maxLen = 1;
        //设dp[i][j]为坐标i-j区间的字符串是否为回文字符串
        for (int r = 1; r < len; r++) {
            for (int l = 0; l < r; l++) {
                if(s.charAt(r)==s.charAt(l)&&(r-l<=2||dp[l+1][r-1])){
                    dp[l][r] = true;
                    if(r-l+1>maxLen){
                        maxLen = r-l+1;
                        maxStart = l;
                        maxEnd = r;
                    }
                }

            }

        }
        return s.substring(maxStart,maxEnd+1);


    }

}
