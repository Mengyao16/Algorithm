package Algorithm.leetcode.lc0100;

public class lc152 {
    public int maxProduct(int[] nums) {
        //动态规划
        //maxdp[i]设为以i结尾的最大乘积序列的值
        //mindp[i]设为以i结尾的最大乘积序列的值
        int len = nums.length;
        int[] maxdp = new int[len];
        int[] mindp = new int[len];
        maxdp[0] = nums[0];
        mindp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < len; i++) {
            maxdp[i] = Math.max(nums[i],Math.max(nums[i]*maxdp[i-1],nums[i]*mindp[i-1]));
            mindp[i] = Math.min(nums[i],Math.min(nums[i]*maxdp[i-1],nums[i]*mindp[i-1]));
            res = Math.max(res,maxdp[i]);
        }
        return res;

    }
}
