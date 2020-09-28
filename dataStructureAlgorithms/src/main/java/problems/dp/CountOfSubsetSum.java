package problems.dp;

/**
 * @author harshit.mago
 */
public class CountOfSubsetSum {

    public static int count(int arr[], int sum, int n, int count, int mem[][]) {
        if (n < 0 && sum != 0) {
            return count;
        } else if (sum == 0) {
            return count + 1;
        }

        if (mem[n][sum] > 0) {
            return mem[n][sum];
        }
        if (arr[n] <= sum) {
            mem[n][sum] = count(arr, sum - arr[n], n - 1, count, mem) + count(arr, sum, n - 1, count, mem);
        } else {
            mem[n][sum] = count(arr, sum, n - 1, count, mem);
        }

        return mem[n][sum];
    }

    public static int topDownApproach(int arr[], int sum) {
        if (sum == 0) {
            return 1;
        }

        int n = arr.length;
        int holder[][] = new int[n + 1][sum + 1];
        holder[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    holder[i][j] = 1;
                } else if (j < arr[i - 1]) {
                    holder[i][j] = holder[i - 1][j];
                } else {
                    holder[i][j] = holder[i - 1][j] + holder[i - 1][j - arr[i - 1]];
                }
            }
        }
        return holder[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3};
        int x = 6;

        int mem[][] = new int[arr.length + 1][x + 1];
        System.out.println("Recursive Approach: " + count(arr, x, arr.length - 1, 0, mem));
        System.out.println("Top Down Approach: " + topDownApproach(arr, x));
    }
}
