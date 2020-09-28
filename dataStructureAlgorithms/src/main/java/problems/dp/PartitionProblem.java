package problems.dp;

import utils.ArrayUtils;

/**
 * @author harshit.mago
 */
public class PartitionProblem {

    public static boolean find(int arr[], int n) {

        int sum = ArrayUtils.sum(arr);
        if (sum % 2 != 0) {
            return false;
        }

        int findSum = sum / 2;
        boolean mem[][] = new boolean[n + 1][findSum + 1];
        return subsetSum(arr, findSum);
    }

    public static boolean subsetSum(int arr[], int sum) {
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
                } else if (j < arr[i - 1]) {
                    holder[i][j] = holder[i - 1][j];
                } else {
                    holder[i][j] = holder[i - 1][j] || holder[i - 1][j - arr[i - 1]];
                }
            }
        }

        return holder[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 11, 5};
        System.out.println(find(arr, arr.length));
    }
}
