package Algorithm.nowcoder.top101;

public class BM97 {
    //旋转数组
    //leetcode 189 轮转数组
    public void rotate (int[] nums,int k){
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
    }
    public void reverse(int[] nums,int left,int right){
        while(left<right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
    //另一种方法，环状替换
}
