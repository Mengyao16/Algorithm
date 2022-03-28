package Algorithm.nowcoder.top101;

public class BM19 {
    //寻找峰值
    public int findPeakElement(int[] nums ){
        int right = nums.length-1;
        int left = 0 ;
        while(left<right){
            int mid = (left +right) / 2;
            if(nums[mid]<nums[mid+1]){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
