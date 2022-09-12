package Algorithm.leetcode;

public class lc005 {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean dp[][] = new boolean[len][len];
        int res = 0;
        //dp[i][j]表示i到j区间是不是回文字符串
        //dp[i][j] = (s.charAt(i)==s.charAt(j)&&dp[i+1][j-1])||(j-i<2&&s.charAt(i)==s.charAt(j))
        int resi = 0;
        int resj = 0;
        for (int j =1 ; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if((s.charAt(i)==s.charAt(j))&&(dp[i+1][j-1]||j-i<=2)){
                    dp[i][j] = true;
                    if(j-i+1>res){
                        res = j-i+1;
                        resi = i;
                        resj = j;

                    }

                }

            }

        }
        return s.substring(resi,resj+1);

    }
}
