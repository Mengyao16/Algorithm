package Algorithm.leetcode.lc0400;

public class lc461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int ans = 0;
        while(z > 0){
            ans = z%2==1?ans +1:ans;
            z = z / 2;
        }
        return ans;
    }

    //更简单，Brian Kernighan 算法
    public int hammingDistance2(int x, int y) {
        int s = x ^ y, ret = 0;
        while (s != 0) {
            s &= s - 1;
            ret++;
        }
        return ret;
    }

}
