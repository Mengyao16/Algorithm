package Algorithm.nowcoder.top101;

public class BM52 {
    //数组中只出现一次的两个数字
    //分组异或
    //leetcode 剑指offer56
    public int[] singleNumbers(int[] nums){
        int a = 0;
        for (int num:
             nums) {
            a = num ^a;

        }

        int b = 1;
        while((a&b)==0){
            b = b<< 1;
        }
        int res1 = 0, res2 = 0;
        for (int n:
             nums) {
            if((b&n)==0){
                res1 ^= n;
            }else{
                res2 ^= n;
            }
        }
        return new int[]{res1,res2};


    }
}
