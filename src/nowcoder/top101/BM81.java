package Algorithm.nowcoder.top101;

public class BM81 {
    public int maxProfit(int[] prices){
        //每一天都可以决定购买和出售股票，最多只能持有一股股票
        int len = prices.length;
        int sum =0;

        for (int i = 0; i < len-1; i++) {
            if(prices[i+1]>prices[i]){
                sum += (prices[i+1]-prices[i]);
            }
        }
        return sum ;

    }
    public int maxProfit2(int[] prices){
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[len-1][0];

    }
}
