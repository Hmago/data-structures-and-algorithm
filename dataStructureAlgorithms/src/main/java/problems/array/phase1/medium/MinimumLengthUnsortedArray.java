package problems.array.phase1.medium;

/*
 * Shortest Unsorted Continous Subarray
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 *
 * Link: https://leetcode.com/articles/shortest-unsorted-continous-subarray/
 *
 * Time Complexity: O(n), space: O(1)
 */
public class MinimumLengthUnsortedArray {

    public int findLength(int arr[]) {
        int starts_at = -1, ends_at = -1, min_element_in_unsorted_array = Integer.MAX_VALUE, max_element_in_unsorted_array = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                starts_at = i;
                break;
            }
        }

        /* Already sorted */
        if (starts_at == -1) {
            return 0;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1] || arr[starts_at] > arr[i]) {
                ends_at = i;
                break;
            }
        }

        for (int i = starts_at; i < ends_at; i++) {
            if (arr[i] < min_element_in_unsorted_array) {
                min_element_in_unsorted_array = arr[i];
            }

            if (arr[i] > max_element_in_unsorted_array) {
                max_element_in_unsorted_array = arr[i];
            }
        }

        ends_at = -1;
        starts_at = -1;
        for (int i = 0; i < arr.length; i++) {
            if (starts_at == -1 && arr[i] > min_element_in_unsorted_array) {
                starts_at = i;
            }

            if (ends_at == -1 && arr[i] > max_element_in_unsorted_array) {
                ends_at = i - 1;
            }
        }

        return (ends_at - starts_at) + 1;
    }
}
