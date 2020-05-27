package problems.dp;

/**
 * @author harshit.mago
 */
public class Knapsack01Problem {


    public static int maxProfilt(int price[], int weights[], int n, int maxWeight, int mem[][]) {
        if (n < 0 || maxWeight == 0) {
            return 0;
        }

        if (mem[n][maxWeight] > 0) {
            return mem[n][maxWeight];
        }

        if (weights[n] <= maxWeight) {
            mem[n][maxWeight] = Math.max(
                    (price[n] + maxProfilt(price, weights, n - 1, maxWeight - weights[n], mem)),
                    maxProfilt(price, weights, n - 1, maxWeight, mem)
            );
        } else {

            mem[n][maxWeight] = maxProfilt(price, weights, n - 1, maxWeight, mem);
        }

        return mem[n][maxWeight];
    }

    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;

        int mem[][] = new int[n+1][W+1];
        System.out.println(maxProfilt(val, wt, n - 1, W, mem));
    }
}
