package Algorithm.nowcoder.top101;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BM54 {
    //三数之和
    //leetcode 15

    //排序+双指针
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<=2) return res;
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n-2; i++) {
            if(nums[i]>0) break;
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left = i+1,right = n-1;
            int target = -nums[i];
            while(left<right){
                if(nums[left]+nums[right]>target){
                    right--;
                }else if(nums[left]+nums[right]<target){
                    left++;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i] );
                    list.add(nums[left] );
                    list.add(nums[right] );
                    res.add(list);
                    left++;right--;
                    while(left<right&&nums[left]==nums[left-1]) left++;
                    while(left<right&&nums[right]==nums[right+1]) right--;
                }
            }
        }
        return  res;

    }

}
