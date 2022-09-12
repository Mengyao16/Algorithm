package Algorithm.leetcode.CodingInterviews;

import java.util.HashSet;

/*
* 数组中的重复数字
* 输入[2, 3, 1, 0, 2, 5, 3]
* 输出2 或 3
* */
public class ci03 {
    //数组中的重复数字
    public int findRepeatNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);

        }
        return -1;
    }
}
