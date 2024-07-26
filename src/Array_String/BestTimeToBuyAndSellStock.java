package Array_String;

public class BestTimeToBuyAndSellStock {
    static int buyAndSellStock(int[] arr)
    {
        int buy = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i]-buy)<0)
            {
                buy = arr[i];
            }
            maxProfit = Math.max(maxProfit,(arr[i]-buy));
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println("maximum profit i got rupees  "+buyAndSellStock(arr));
    }
}

