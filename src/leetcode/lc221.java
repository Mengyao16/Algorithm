package Algorithm.leetcode;

public class lc221 {
    public int maximalSquare(char[][] matrix) {
        //动态规划，设dp[i][j]是以matrix[i][j]为右下角，
        // 组成的边长最大的正方形的边长
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int[][] dp = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            if(matrix[i][0]=='1'){
                dp[i][0] = 1;
            }
        }
        for (int i = 0; i < len2; i++) {
            if(matrix[0][i]=='1'){
                dp[0][i] = 1;
            }
        }
        int res = 0 ;
        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                if(matrix[i][j] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]) + 1;

                }
            }

        }
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                res = Math.max(res,dp[i][j]);
            }

        }
        return res * res;
    }
}
