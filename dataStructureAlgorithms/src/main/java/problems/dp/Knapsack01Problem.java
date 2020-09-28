package problems.dp;

import java.util.Arrays;

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

    public static int topDownApproach(int price[], int weights[], int maxWeight) {
        if (maxWeight == 0) {
            return 0;
        }

        int n = price.length;
        int holder[][] = new int[n + 1][maxWeight + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maxWeight; j++) {
                if (j < weights[i - 1]) {
                    holder[i][j] = holder[i - 1][j];
                } else {
                    holder[i][j] = Math.max(holder[i - 1][j], price[i - 1] + holder[i - 1][j - weights[i - 1]]);
                }
            }
        }
        return holder[n][maxWeight];
    }

    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;

        int mem[][] = new int[n + 1][W + 1];
        System.out.println(maxProfilt(val, wt, n - 1, W, mem));
        System.out.println("Second Solution using Top Down approach is");
        System.out.println(topDownApproach(val, wt, W));
    }
}
