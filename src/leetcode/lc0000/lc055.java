package Algorithm.leetcode.lc0000;

public class lc055 {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;

        for (int i = 0; i < nums.length; i++) {
            if(dp[i]){
                for (int j = 1; j <= nums[i]; j++) {
                    if(i+j<nums.length){
                        dp[i+j] = true;
                    }
                }
            }
        }
        return dp[nums.length-1];


    }
    public boolean canJump2(int[] nums) {
        int rightmost = 0;
        for (int i = 0; i < nums.length; i++) {
            if(rightmost<i){
                return false;
            }
            if(rightmost>nums.length){
                return true;
            }
            rightmost = Math.max(rightmost,i+nums[i]);
        }
        return true;
    }
}
