package Algorithm.nowcoder.top101;

import java.util.Arrays;

public class BM70 {
    public int coinChange(int[] coins,int amount ){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+2);
        dp[0] = 0;

        for (int i = 1; i <=amount; i++) {

            for (int j = 0; j < coins.length; j++) {
                if((i-coins[j])>=0){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }


            }
        }
        return dp[amount]<amount+1?dp[amount]:-1;



    }

}
