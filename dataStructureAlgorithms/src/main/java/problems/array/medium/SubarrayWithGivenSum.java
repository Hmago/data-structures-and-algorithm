package problems.array.medium;

/*
 * Find subarray with given sum
 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 * Ouptut: Sum found between indexes 2 and 4
 *
 * link: https://www.geeksforgeeks.org/find-subarray-with-given-sum/
 *
 * Time: O(n), Space: O(1)
 */
public class SubarrayWithGivenSum {

    public int[] find(int arr[], int sum) {
        int output[] = new int[2];
        int sum_so_far = arr[0], start = 0, end = 0;
        for (end = 1; end < arr.length; end++) {
            sum_so_far = sum_so_far + arr[end];

            while (start != end && sum_so_far > sum) {
                sum_so_far = sum_so_far - arr[start];
                start++;
            }

            if (sum_so_far == sum) {
                output[0] = start;
                output[1] = end;
                return output;
            }
        }

        output[0] = -1;
        output[1] = -1;
        return output;
    }
}
