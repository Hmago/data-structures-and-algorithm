package problems.matrix;

/**
 * @author harshit.mago
 * <p>
 * Maximum path sum in matrix
 * Input : mat[][] = 10 10  2  0 20  4
 *                    1  0  0 30  2  5
 *                    0 10  4  0  2  0
 *                    1  0  2 20  0  4
 * <p>
 * Output : 74
 * The maximum sum path is 20-30-4-20.
 * <p>
 * Link: https://www.geeksforgeeks.org/maximum-path-sum-matrix/
 */
public class MaximumSumPath {
    public int find(int arr[][]) {

        int rowSize = arr.length, colLength = arr[0].length;
        for (int i = 1; i < rowSize; i++) {

            for (int j = 0; j < colLength; j++) {
                int max = 0;
                if (j == 0) {
                    max = Math.max(arr[i - 1][j], arr[i - 1][j + 1]);
                } else if (j == colLength - 1) {
                    max = Math.max(arr[i - 1][j], arr[i - 1][j - 1]);
                } else {
                    max = Math.max(arr[i - 1][j - 1], Math.max(arr[i - 1][j], arr[i - 1][j + 1]));
                }

                arr[i][j] = arr[i][j] + max;
            }
        }

        int max = 0;
        for(int j=0;j<colLength;j++){
            if(arr[rowSize-1][j]>max){
                max = arr[rowSize-1][j];
            }
        }
        
        return max;
    }


}
