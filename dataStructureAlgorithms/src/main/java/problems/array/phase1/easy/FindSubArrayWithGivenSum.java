package problems.array.phase1.easy;

/**
 * Find subarray with given sum | Set 1 (Nonnegative Numbers)
 * <p>
 * Link: https://www.geeksforgeeks.org/find-subarray-with-given-sum/
 */
public class FindSubArrayWithGivenSum {

    public int[] find(int arr[], int sum) {

        int tempSum = 0, start = 0;
        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;

        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];

            while (tempSum > sum && start < i) {
                tempSum = tempSum - arr[start];
                start++;
            }

            if (sum == tempSum) {
                result[0] = start;
                result[1] = i;
                break;
            }


        }

        return result;
    }

    /*
     * Given a list of non-negative numbers and a target integer k, write a function to check if the array has a continuous subarray of size at least 2 that sums up to a multiple of k, that is, sums up to n*k where n is also an integer.
     */

    boolean checkSubarraySum(int arr[], int sum) {
        int sumArray = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sumArray += arr[i];

            int tempSum = sumArray;
            for (int j = 0; j < i; j++) {
                if (sum != 0 && tempSum % sum == 0) {
                    return true;
                }

                if (sum == tempSum) {
                    return true;
                }

                tempSum -= arr[j];
            }
        }

        return false;
    }
}
