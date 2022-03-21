package Algorithm.nowcoder.top101;

public class BM80_dp_stock {




    //input [8,9,2,5,4,7,1] return 5
    public int maxProfit (int[] prices) {
        // write code here
        int min =10000000;
        int maxpro = 0;
        for (int i = 0; i < prices.length; i++) {
            maxpro = Math.max(maxpro,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return maxpro;
    }

    public int maxProfitII (int[] prices) {
        // write code here
        int profit = 0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit = profit +(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }

}
