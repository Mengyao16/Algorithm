package Algorithm.leetcode.lc0000;

public class lc050 {
    public double myPow(double x, int n){
        if(n==0) return 1;

        double res = myPow( x, n/2);
        res = res* res;

        if(n%2!=0) {
            if(n<0){
                res = res *(1.0/x) ;
            }else{
                res = res * x;
            }

        }
        return res;

    }

}
