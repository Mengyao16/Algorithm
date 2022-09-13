package Algorithm.leetcode.lc0000;

public class lc069 {
    public int mySqrt(int x) {
        int r = x;
        int l = 0;
        int ans  =0;
        while(l<=r){
            int mid = l + (r-l) /2;
            if((long)mid*mid<=x){
                ans = mid;
                l = mid+1;
            }else{
                r = mid -1;
            }
        }
        return ans ;



    }
}
