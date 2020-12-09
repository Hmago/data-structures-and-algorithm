package problems.dp;

import java.util.Arrays;

public class MatrixChainMultiplication {

    public static int holder[][];

    public static int findMCM(int arr[], int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (holder[i][j] != -1) {
            return holder[i][j];
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int count = findMCM(arr, i, k) + findMCM(arr, k + 1, j) + arr[i-1]*arr[k]*arr[j];
            if (count < min) {
                min = count;
            }
        }

        holder[i][j] = min;
        return min;
    }

    public static void createHolder(int n){
        holder = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(holder[i], -1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};

        createHolder(arr.length);
        System.out.println("Minimum MCM="+findMCM(arr, 1, arr.length-1));
    }
}
