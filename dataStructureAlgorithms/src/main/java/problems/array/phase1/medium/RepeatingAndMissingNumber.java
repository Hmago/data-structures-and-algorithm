package problems.array.phase1.medium;

/*
 * Find the repeating and the missing
 * Input: arr[] = {3, 1, 3}
 * Output: Missing = 2, Repeating = 3
 * Explanation: In the array,
 * 2 is missing and 3 occurs twice
 *
 * Link: http://geeksforgeeks.org/find-a-repeating-and-a-missing-number/
 *
 * Time: O(n), Space:O(1)
 */
public class RepeatingAndMissingNumber {

    public int[] find(int arr[]) {
        int repeating = -1, duplicate = -1, abs_value;
        for (int i = 0; i < arr.length; i++) {
            abs_value = Math.abs(arr[i]);
            if (arr[abs_value - 1] > 0) {
                arr[abs_value - 1] = -1 * arr[abs_value - 1];
            } else {
                repeating = abs_value;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && i + 1 != repeating) {
                duplicate = i + 1;
            }
        }

        return new int[]{repeating, duplicate};
    }
}
