package Algorithm.nowcoder.top101;

import java.util.Arrays;

public class BM51 {
    //多数元素
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    //时间复杂度o(n)的方法
    //摩尔投票法
    public int majorityElement2(int[] nums){
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] == candidate){
                count++;
            }else {
                count--;
                if(count==0){
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        return  candidate;

    }
}
