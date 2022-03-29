package Algorithm.nowcoder.top101;

public class BM65 {
    //最长公共子序列
    public int longestCommonSubsequence(String text1,String text2){
        if(text1.length()==0||text1.length()==0) return 0;
        //二维动态规划问题
        int m = text1.length();
        int n = text2.length();
        //dp[i][j]为text1[0:i]和text2[0:j]最长公共子序列的长度
        //当i=0时，空字符串和任意字符串的最长公共子序列长度为0，所以dp[0][j] =0
        //同理，dp[i][0] =0
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < n+1; i++) {
            dp[0][i] = 0;
        }
        //当i>0和j>0考虑dp的计算
        for (int i = 1; i <=m ; i++) {
            char c1 = text1.charAt(i-1);
            for (int j = 1; j <=n; j++) {
                char c2 = text2.charAt(j-1);
                if(c1==c2){
                    dp[i][j] = dp[i-1][j-1] +1;
                }else {
                    dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1]);
                }

            }

        }
        return dp[m][n];


    }

}
