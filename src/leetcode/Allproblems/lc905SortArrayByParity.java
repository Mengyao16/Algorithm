package Algorithm.leetcode.Allproblems;

public class lc905SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while(start<end){
            while(start<end&&nums[start]%2==0){
                start++;
            }
            while(start<end&&nums[end]%2!=0){
                end--;
            }
            if(start<end){
                swap(nums,start,end);
            }
        }
        return nums;

    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
