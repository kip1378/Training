package LeetCode;

public class maxProfit2 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices [i]) {
                minPrice = prices[i];
            } else {
                profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }

            }

        }
        return maxProfit;
    }
}