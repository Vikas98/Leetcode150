package Array_String;

public class BestTimeToBuyAndSellStocks2 {
    static int maxProfitFromStocks(int [] prices)
    {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]-buy<0)
            {
                buy = prices[i];
            }
            else
            {
                profit += prices[i]-buy;
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println("maximum profit i got after buying and selling stocks is "+maxProfitFromStocks(arr));
    }
}
