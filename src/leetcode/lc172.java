package Algorithm.leetcode;

public class lc172 {
    public  int trailingZeroes(int n){
        int res = 0;
        while(n>0){
            res = res + n /5;
            n /=5;
        }
        return res;
    }
}
