package problems.array.phase3;

public class MaxProfitBySellingStocks {

    public static int singleTransaction(int arr[]) {
        if (arr.length < 2) {
            return 0;
        }

        int min = arr[0], maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (arr[i] - min > maxProfit) {
                maxProfit = arr[i] - min;
            }
        }

        return maxProfit;
    }

    public static int nTransactions(int arr[], int transactions) {
        int T[][] = new int[transactions + 1][arr.length];

        int max_profit = 0;
        for (int i = 1; i <= transactions; i++) {
            for (int j = 1; j < arr.length; j++) {
                max_profit = T[i][j - 1];
                for (int k = 0; k < j; k++) {
                    max_profit = Math.max(max_profit, ((arr[j] - arr[k]) + T[i - 1][k]));
                }

                T[i][j] = max_profit;
            }

//            System.out.println(Arrays.toString(T[i]));
        }

        return T[transactions][arr.length - 1];
    }

    public static void main(String[] args) {
        System.out.println("Single Transaction");
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println(singleTransaction(arr));

        System.out.println("N Transactions");
        int arr2[] = {2, 5, 7, 1, 4, 3, 1, 3};
        System.out.println(nTransactions(arr2, 3));
    }
}
