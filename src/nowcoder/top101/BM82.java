package Algorithm.nowcoder.top101;

public class BM82 {
    //买卖股票的最佳时机
    public int maxProfit(int[] prices){
        int len = prices.length;

        int[][][] dp = new int[len][2][3];
        //dp[天数][当前是否持股][卖出的次数]
        dp[0][0][0] = 0;
        dp[0][0][1] = Integer.MIN_VALUE/2;
        dp[0][1][1] = Integer.MIN_VALUE/2;
        dp[0][0][2] = Integer.MIN_VALUE/2;
        dp[0][1][2] = Integer.MIN_VALUE/2;
        dp[0][1][0] = -prices[0];

        for (int i = 1; i < len; i++) {
            dp[i][0][0] = 0;
            dp[i][0][1] = Math.max(dp[i - 1][1][0] + prices[i], dp[i - 1][0][1]);
            dp[i][0][2] = Math.max(dp[i - 1][1][1] + prices[i], dp[i - 1][0][2]);
            dp[i][1][0] = Math.max(dp[i - 1][0][0] - prices[i], dp[i - 1][1][0]);
            dp[i][1][1] = Math.max(dp[i - 1][0][1] - prices[i], dp[i - 1][1][1]);
            //dp[i][0][1] = Math.max(dp[i-1][0][1],dp[i-1][1][0]+prices[i]);
            //dp[i][1][0] = Math.max(dp[i-1][1][0],dp[i-1][0][0]-prices[i]);
            //dp[i][1][1] = Math.max(dp[i-1][1][1],dp[i-1][0][1]-prices[i]);
            //dp[i][0][2] = Math.max(dp[i-1][0][2],dp[i-1][1][1]+prices[i]);
            dp[i][1][2] = Integer.MIN_VALUE/2;



        }
        return  Math.max(0,Math.max(dp[len-1][0][1],dp[len-1][0][2]));



    }
}
