package Algorithm.leetcode;

import java.util.Arrays;

public class lc279 {
    //完全平方数，动态规划
    //给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0] = 0;
        dp[1]  = 1;
        for (int i = 2; i <= n; i++) {
            int z = 1;
            while(i-z*z>=0){
                dp[i] = Math.min(dp[i],dp[i-z*z]+1);
                z++;
            }
        }
        return dp[n];



    }
}
