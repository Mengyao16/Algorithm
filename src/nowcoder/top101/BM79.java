package Algorithm.nowcoder.top101;

import java.util.Arrays;

public class BM79 {
    public int rob(int[] nums){
        int len = nums.length ;
        if(len==0) return 0;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0],nums[1]);
        if(len==3) return Math.max(nums[0],Math.max(nums[1],nums[2]));
        //不偷最后一个房子的情况下
        //不偷第一个房子的情况下
        return Math.max(robRange(Arrays.copyOfRange(nums,0,len-1)),
                robRange(Arrays.copyOfRange(nums,1,len)));


    }
    public int robRange(int[] nums){
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return Math.max(dp[len-1],dp[len-2]);
    }
}
