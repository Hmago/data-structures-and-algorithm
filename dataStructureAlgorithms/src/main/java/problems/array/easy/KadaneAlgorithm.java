package problems.array.easy;

/**
 * Largest Sum Contiguous Subarray
 * Link: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class KadaneAlgorithm {

    public int max(int arr[]) {
        int max = Integer.MIN_VALUE, sum_so_far = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_so_far += arr[i];

            if (sum_so_far > max) {
                max = sum_so_far;
            }

            if(sum_so_far<0){
                sum_so_far=0;
            }
        }

        return max;
    }
}
