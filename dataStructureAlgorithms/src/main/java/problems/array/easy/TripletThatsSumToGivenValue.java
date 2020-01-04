package problems.array.easy;

import algorithms.basic.sort.QuickSort;

/*
 * Find a triplet that sum to a given value
 * if the given array is {12, 3, 4, 1, 6, 9} and given sum is 24, then there is a triplet (12, 3 and 9) present in array whose sum is 24.
 *
 * Link: https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class TripletThatsSumToGivenValue {

    public boolean isCombinationExists(int arr[], int sum) {
        boolean exists = false;

        arr = (new QuickSort()).sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1, k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == sum) {
                    return true;
                }

                if (arr[i] + arr[j] + arr[k] < sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return exists;
    }

}
