package problems.dp;

public class CoinChanging {

    public static int numberOfWays(int arr[], int sum) {
        if (sum == 0) {
            return 0;
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
                    holder[i][j] = holder[i - 1][j] + holder[i][j - arr[i - 1]];
                }
            }
        }

        return holder[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println("Output 1: "+numberOfWays(arr, 4));

        arr = new int[]{2,5,3,6};
        System.out.println("Output 1: "+numberOfWays(arr, 10));
    }
}
