package arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        System.out.println(getMax(prices));
    }
     public static int maxProfit(int[] prices) {
        int profit = 0;
        int maxProfit = 0;
        for (int i = 0; i<prices.length; i++){
            for (int j = i+1; j<prices.length; j++){
                profit = prices[j] - prices[i];
                if (profit < 0 ) profit = 0;
                else if (profit > maxProfit) maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static int getMax(int[] prices){
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i<prices.length; i++){
            int cost = prices[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}
