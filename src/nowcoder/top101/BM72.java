package Algorithm.nowcoder.top101;

public class BM72 {

    //连续子数组的最大和
    public int maxSubArray(int[] nums){
        //设dp[i]是以nums[i]为结尾的连续数组的最大和
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < len; i++) {
            if(dp[i-1]>0){
                dp[i] = dp[i-1]+nums[i];
            }else{
                dp[i] = nums[i];
            }
            max = Math.max(dp[i],max);
        }
        return max;

    }
}
