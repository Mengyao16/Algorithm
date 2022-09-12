package Algorithm.leetcode;

/*
[0....zero,zero+1....two-1,two]
 */
public class lc075 {
    public void sortColors(int[] nums){
        int len = nums.length;
        if(len<1) return ;
        int zero = 0;
        int two = len -1;
        int i  = 0;
        while(i<two){
            if(nums[i]==0){
                swap(nums,i,zero);
                i++;
                zero++;
            }else if (nums[i] ==1){
                i++;
            }else{
                swap(nums,i,two);
                two--;
            }


        }

    }
    public void swap(int[] nums,int i ,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
