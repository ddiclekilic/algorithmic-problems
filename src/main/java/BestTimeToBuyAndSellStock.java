
/*
You are given an array prices where prices[i] is the price of a given stock on the i^th day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different
day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
 */

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}