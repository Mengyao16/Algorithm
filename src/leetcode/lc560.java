package Algorithm.leetcode;

public class lc560 {


    //dfs超时
    int count = 0;
    public int subarraySum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            dfs(nums,k,i);
        }
        return count;


    }
    public void dfs(int[] nums,int sum,int level ){
        if(level == nums.length) return ;
        if(nums[level]==sum) count++;
        dfs(nums,sum-nums[level],level+1);
    }
}
