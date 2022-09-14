package Algorithm.leetcode.lc0100;

public class lc136 {
    //只出现一次的数字
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int a :
             nums) {
            res = res ^ a;
        }
        return res;

    }
}
