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

    public int find(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])] >= 0) {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            } else {
                return Math.abs(nums[i]);
            }
        }

        return -1;
    }

}
