package Algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0;i<nums.length-2;i++){
            if(nums[i]>0) break;
            if(i!=0 && nums[i-1]==nums[i]){
                continue;
            }
            int left = i+1;
            int right = nums.length -1;
            while(left<right){

                int sum = nums[i]  + nums[left] + nums[right];
                if(sum==0){
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    while(left<right&&nums[left+1]==nums[left]){
                        left++;
                    }
                    while(left<right&&nums[right-1]==nums[right]){
                        right--;
                    }
                    left++;
                    right--;



                }else if(sum <0){
                    left++;
                }else{
                    right--;
                }
            }


        }
        return res;

    }

}
