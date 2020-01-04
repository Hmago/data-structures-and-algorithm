package problems.array.medium;

import utils.ArrayUtils;

/*
 * Reorder an array according to given indexes
 *
 * Input:  arr[]   = [10, 11, 12];
 *      index[] = [1, 0, 2];
 * Output: arr[]   = [11, 10, 12]
 *      index[] = [0,  1,  2]
 *
 * Link: https://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/
 * time complexity O(n) and auxiliary space O(1)
 */
public class ReorderArrayAccordingToIndexes {

    public void rearrange(int arr[], int indexes[]) {
        for (int i = 0; i < indexes.length; i++) {
            while (i != indexes[i]) {
                ArrayUtils.swap(arr, i, indexes[i]);
                ArrayUtils.swap(indexes, i, indexes[i]);
            }
        }
    }
}
