package Algorithm.leetcode;

import java.util.HashMap;

public class lc560 {

    public int subarraySum(int[] nums, int k) {
        //固定右边界，暴力遍历，复杂度n*n
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            int sum = 0;
            for (int left = right; left >= 0; left--) {
                sum += nums[left];
                if(sum ==k) count++;
            }

        }
        return count;
    }
    //前缀和
    public int subarraySum2(int[] nums, int k){
        int[] preSum = new int[nums.length+1];
        preSum[0] = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum[i+1] = preSum[i] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(preSum[j+1]-preSum[i]==k){
                    count++;
                }
            }
        }
        return count;
    }
    //前缀和+哈希表优化
    public int subarraySum3(int[] nums, int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        map.put(0,1);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum = preSum + nums[i];
            if(map.containsKey(preSum-k)){
                count = count + map.get(preSum-k);
            }
            map.put(preSum, map.getOrDefault(preSum,0)+1 );
        }

        return count;
    }


}
