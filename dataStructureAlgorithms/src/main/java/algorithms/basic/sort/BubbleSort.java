package algorithms.basic.sort;

import utils.ArrayUtils;

/*
 * Time Complexity:
 *      Best Case: O(n)
 *      Avg, Worst Case: O(n^2)
 *
 * Space Complexity: O(1)
 */
public class BubbleSort {

    public int[] sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            boolean is_swaped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtils.swap(arr, j + 1, j);
                    is_swaped=true;
                }
            }

            if(!is_swaped){
                return arr;
            }

        }
        return arr;
    }
}
