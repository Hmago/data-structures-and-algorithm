package problems.matrix;

/**
 * Print a given matrix in spiral form
 * Input:
 * 1    2   3   4
 * 5    6   7   8
 * 9   10  11  12
 * 13  14  15  16
 * Output:
 * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 * <p>
 * Link: https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
 */
public class SpiralPrint {

    public void print(int arr[][]) {
        int min_i = 0, max_i = arr.length - 1;
        int min_j = 0, max_j = arr[0].length - 1;

        while (min_i <= max_i) {

            for (int j = min_j; j <= max_j; j++) {
                System.out.print(arr[min_i][j] + " ");
            }

            for (int i = min_i + 1; i <= max_i; i++) {
                System.out.print(arr[i][max_j] + " ");
            }

            if (min_i != max_i) {
                for (int j = max_j - 1; j >= min_j; j--) {
                    System.out.print(arr[max_i][j] + " ");
                }

                for (int i = max_i - 1; i > min_i; i--) {
                    System.out.print(arr[i][min_i] + " ");
                }
            }

            max_i--;
            max_j--;
            min_i++;
            min_j++;


        }
    }
}
