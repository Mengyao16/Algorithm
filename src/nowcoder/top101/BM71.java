package Algorithm.nowcoder.top101;

import java.util.Arrays;

public class BM71 {
    //最长上升子序列
    public int lengthOfLIS(int[] nums){

        //dp[i]表示以nums[i]为结尾的最长上升子序列的个数
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }

            }

        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[i],max);
        }
        return max;



    }

}
