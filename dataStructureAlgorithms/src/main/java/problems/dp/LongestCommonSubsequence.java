package problems.dp;

public class LongestCommonSubsequence {

    public static int length(char arr1[], char arr2[]) {
        int n = arr1.length;
        int holder[][] = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    holder[i][j] = 0;
                }else if(arr1[i-1]==arr2[j-1]){
                    holder[i][j] = 1 + holder[i][j-1];
                }else{
                    holder[i][j] = Math.max(holder[i][j-1], holder[i-1][j]);
                }
            }
        }

        return holder[n][n];
    }

    public static void main(String[] args) {
        char arr1[] = {'A', 'B', 'C', 'D', 'G', 'H'};
        char arr2[] = {'A', 'E', 'D', 'F', 'H', 'R'};

        System.out.println("Longest Common subsequence="+length(arr1, arr2));
    }
}
