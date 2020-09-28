package problems.dp;

public class PartitionIntoTwoSetWithMinDiff {

    public static int topDownApproach(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }

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

        System.out.println();
        int diff = Integer.MAX_VALUE;
        for (int j = sum / 2; j >= 0; j--) {
            if (holder[n][j]) {
                diff = sum - (2 * j);
                break;
            }
        }

        return diff;
    }

    public static void main(String[] args) {
        int arr[] = {1,6,11,5};
        System.out.println("Min diff="+topDownApproach(arr));
    }
}
