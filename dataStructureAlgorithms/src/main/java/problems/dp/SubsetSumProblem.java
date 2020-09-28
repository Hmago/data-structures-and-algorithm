package problems.dp;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author harshit.mago
 */
public class SubsetSumProblem {

    public static boolean find(int arr[], int n, int sum, boolean mem[][]) {
        if (n < 0 && sum != 0) {
            return false;
        } else if (sum == 0) {
            return true;
        }

        if (mem[n][sum]) {
            return true;
        }

        if (arr[n] <= sum) {
            mem[n][sum] = find(arr, n - 1, sum - arr[n], mem) || find(arr, n - 1, sum, mem);
        } else {
            mem[n][sum] = find(arr, n - 1, sum, mem);
        }

        return mem[n][sum];
    }

    public static boolean topDownApproach(int arr[], int sum) {
        if (sum == 0) {
            return true;
        }

        int n = arr.length;
        boolean holder[][] = new boolean[n + 1][sum + 1];
        holder[0][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    holder[i][j] = true;
                } else if (arr[i - 1] > j) {
                    holder[i][j] = (holder[i - 1][j]);
                } else {
                    holder[i][j] = (holder[i - 1][j]) || (holder[i-1][j - arr[i - 1]]);
                }
            }
            System.out.printf("");
        }

        return holder[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 10;

        boolean mem[][] = new boolean[arr.length + 1][sum + 1];
        System.out.println("Bottom Up:"+find(arr, arr.length - 1, sum, mem));

        Arrays.sort(arr);
        System.out.println("Top Down:"+topDownApproach(arr, sum));
    }
}
