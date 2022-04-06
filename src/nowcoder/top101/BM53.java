package Algorithm.nowcoder.top101;

public class BM53 {
    //缺失的第一个正整数
    public int firstMissingPositive(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i]<=0) nums[i] = len+1;
        }
        for (int i = 0; i < len; i++) {
            if(Math.abs(nums[i])<=len&&Math.abs(nums[i])>=1){
                int idx = Math.abs(nums[i])-1;
                nums[idx] = -Math.abs(nums[idx]);
            }
        }
        for (int i = 0; i < len; i++) {
            if(nums[i]>0){
                return i+1;
            }
        }
        return len+1;

    }

}
