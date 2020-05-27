package problems.dp;

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

    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 300;

        boolean mem[][] = new boolean[ arr.length + 1][sum + 1];
        System.out.println(find(arr, arr.length - 1, sum, mem));
    }
}
