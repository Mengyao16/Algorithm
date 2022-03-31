package Algorithm.nowcoder.top101;

public class BM80 {

    public int maxProfit(int[] prices){
        int len = prices.length;
        int[] dp = new int[len];
        dp[0] = 0;
        int minBuy = prices[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i],prices[i]-minBuy);
        }
        return dp[len-1];
    }






}
