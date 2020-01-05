package problems.array.medium;

public class BestTimeToBuySellStock {

    public int maxProfileOneTime(int prices[]) {
        int buy = 0, max = 0, max_so_far = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[buy]) {
                buy = i;
            }

            if (prices[i] > prices[buy]) {
                max_so_far = prices[i] - prices[buy];
            }

            if (max_so_far > max) {
                max = max_so_far;
            }
        }

        return max;
    }

    public int maxProfileMultpleTimes(int prices[]) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }

        return profit;
    }
}
