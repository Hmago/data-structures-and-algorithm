package problems.array.medium;

import algorithms.basic.sort.QuickSort;

/*
 * Count triplets with sum smaller than a given value
 * Input : arr[] = {-2, 0, 1, 3}
 *       sum = 2.
 *  Output : 2
 *  Explanation :  Below are triplets with sum less than 2
 *              (-2, 0, 1) and (-2, 0, 3)
 *
 * Link: https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/
 *
 * Time complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class TripletsWithSumLessThanSum {

    public int count(int arr[], int sum) {
        /* Sort the array */
        arr = (new QuickSort()).sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1, k = arr.length - 1;
            while (j<k) {
                if (arr[i] + arr[j] + arr[k] < sum) {
                    System.out.println(arr[i]+" -- "+arr[j]+" -- "+arr[k]);
                    count = count + (k - j);
                    j++;
                } else {
                    k--;
                }
            }
        }

        return count;
    }
}
