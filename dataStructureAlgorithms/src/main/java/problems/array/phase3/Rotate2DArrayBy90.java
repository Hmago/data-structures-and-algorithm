package problems.array.phase3;

import java.util.Arrays;

public class Rotate2DArrayBy90 {

    public static void rotate(int arr[][]) {
        int n = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = arr[i][j];

                arr[i][j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
