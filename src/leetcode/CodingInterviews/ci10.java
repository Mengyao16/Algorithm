package Algorithm.leetcode.CodingInterviews;

public class ci10 {
    public int fib(int n){
        if(n==0||n==1) return n;
        int p = 0;
        int q = 1;
        int sum = 1;
        for (int i = 2; i <=n ; i++) {
            sum = (p+q) % 1000000007;
            p = q;
            q = sum;
        }
        return sum;
    }

}
