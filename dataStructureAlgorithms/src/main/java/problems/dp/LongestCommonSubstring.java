package problems.dp;

public class LongestCommonSubstring {

    public static int length(char[] arr1, char[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int max = 0;
        int holder[][] = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr1[i-1] == arr2[j-1]) {
                    holder[i][j] = 1 + holder[i - 1][j - 1];
                }

                if (holder[i][j] > max) {
                    max = holder[i][j];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        char arr1[] = {'A', 'B', 'C', 'D', 'E'};
        char arr2[] = {'A', 'B', 'F', 'C', 'E'};

        System.out.println("Longest Common substring="+length(arr1, arr2));
    }
}
