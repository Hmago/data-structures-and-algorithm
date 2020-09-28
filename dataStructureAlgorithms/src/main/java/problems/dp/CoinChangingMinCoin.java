package problems.dp;

public class CoinChangingMinCoin {

    public static int minCoins(int arr[], int sum) {
        if (sum == 0) {
            return 1;
        }

        int n = arr.length;
        int holder[][] = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    holder[i][j] = Integer.MAX_VALUE;
                } else if (j == 0) {
                    holder[i][j] = 0;
                } else if (j < arr[i - 1]) {
                    holder[i][j] = holder[i - 1][j];
                } else {
                    holder[i][j] = Math.min(holder[i - 1][j], (1 + holder[i][j - arr[i - 1]]));
                }
            }
        }

        return holder[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 8};
        System.out.println("Min coins="+minCoins(arr, 4));
    }
}
