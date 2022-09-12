package Algorithm.leetcode.lc1000;

public class lc1470 {
    public int[] shuffle(int[] nums, int n){
        int[] res = new int[n*2];
        for (int i = 0; i < 2*n; i++) {
            if(i<n){
                res[2*i] = nums[i];
            }else {
                res[2*(i-n)+1] = nums[i];
            }

        }
        return res;
    }

}
