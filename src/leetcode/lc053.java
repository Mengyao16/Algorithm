package Algorithm.leetcode;

public class lc053 {
    public  int maxSubArray(int[] nums){
        int maxsum = nums[0];
        int leftsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(leftsum<=0){
                leftsum = nums[i];
            }else{
                leftsum = leftsum + nums[i];
            }
            maxsum = Math.max(maxsum,leftsum);

        }
        return maxsum;



    }

}
