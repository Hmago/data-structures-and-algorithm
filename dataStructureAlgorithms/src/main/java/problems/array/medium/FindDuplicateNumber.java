package problems.array.medium;

import java.util.Arrays;

/*
 * Find duplicates in O(n) time and O(1) extra space | Set 1
 * let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
 *
 * Link: https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
 *
 * Time complexity: O(n)
 *
 */
public class FindDuplicateNumber {

    public int find(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])] >= 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else {
                return Math.abs(arr[i]);
            }
        }

        return -1;
    }

}
