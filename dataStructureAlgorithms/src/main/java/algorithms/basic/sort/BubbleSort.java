package algorithms.basic.sort;

import utils.ArrayUtils;

public class BubbleSort {

    public int[] sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtils.swap(arr, j + 1, j);
                }
            }

        }
        return arr;
    }
}
