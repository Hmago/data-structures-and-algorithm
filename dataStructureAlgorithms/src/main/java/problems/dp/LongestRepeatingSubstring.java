package problems.dp;

public class LongestRepeatingSubstring {

    public static int length(char[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int holder[][] = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    holder[i][j] = 0;
                } else if (arr[i-1] == arr[j-1] && i != j) {
                    holder[i][j] = 1 + holder[i - 1][j - 1];
                } else {
                    holder[i][j] = Math.max(holder[i - 1][j], holder[i][j - 1]);
                }
            }
        }

        return holder[n][n];
    }

    public static void main(String[] args) {
        char arr[] = {'A', 'A', 'B', 'E', 'B', 'C', 'D', 'D'};
        System.out.println("Longest Repeating Substring = " + length(arr));
    }
}
