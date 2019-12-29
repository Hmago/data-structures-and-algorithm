package algorithms.basic.sort;

import utils.ArrayUtils;

public class QuickSort {

    /*
     * Time Complexity:
     *      Best case: O( n log(n) )
     *      Avg Case: O( n log(n) )
     *      Worst Case: O(n^2)
     *
     * Space Complexity: O(1)
     */
    public int[] sort(int arr[]) {
        return sort(arr, 0, arr.length - 1);
    }

    private int[] sort(int arr[], int left, int right) {
        if (left < right) {
            int partition = partition(arr, left, right);
            sort(arr, left, partition - 1);
            sort(arr, partition+1, right);
        }

        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                ArrayUtils.swap(arr, i, j);
            }
        }

        i++;
        ArrayUtils.swap(arr, i, right);
        return i;
    }


}
