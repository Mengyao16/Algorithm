package Algorithm.leetcode;

import java.util.Arrays;

public class lc300 {
    //最长递增子序列
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }

            }

        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans = Math.max(dp[i],ans);
        }
        return ans;

    }
}


