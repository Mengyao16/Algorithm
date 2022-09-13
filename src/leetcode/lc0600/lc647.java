package Algorithm.leetcode.lc0600;

public class lc647 {
    /*
    给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。
     */
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if(s.charAt(i)==s.charAt(j)&&(i-j<2||dp[j+1][i-1])){
                    dp[j][i] = true;
                    count++;

                }
            }
        }


        return count;

    }
}
