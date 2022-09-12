package Algorithm.leetcode;

import java.util.Arrays;

public class lc581 {
    //给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
    //
    //请你找出符合题意的 最短 子数组，并输出它的长度。
    public int findUnsortedSubarray(int[] nums) {
        int[] nums2 = new int[nums.length];
        System.arraycopy(nums,0,nums2,0,nums.length);
        Arrays.sort(nums2);
        boolean flag = false;
        int left = -1 ,right  = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums2[i] && !flag){
                left = i;
                flag = true;
                right = i;
            }else if(nums[i]!=nums2[i]  && flag){
                right = i;
            }
        }
        return right <0?0:right - left +1;

    }
    //一次遍历的方法
    public int findUnsortedSubarray2(int[] nums) {
        int left = 0;
        int right = -1;
        int nmax = Integer.MIN_VALUE;
        int nmin = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=nmax){
                nmax = nums[i];
            }else{
                right = i;
            }
        }
        for (int i = nums.length-1; i >=0; i--) {
            if(nums[i]<=nmin){
                nmin = nums[i];
            }else{
                left = i;
            }
        }
        return right - left +1;

    }

}
