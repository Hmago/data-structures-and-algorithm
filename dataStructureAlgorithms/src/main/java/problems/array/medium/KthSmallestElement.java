package problems.array.medium;

import dataStructures.MinHeap;
import utils.ArrayUtils;

public class KthSmallestElement {

    public int find(int arr[], int k) {

        MinHeap minHeap = new MinHeap();
        minHeap.minHeap(arr);

        for (int i = 0; i < k - 1; i++) {
            minHeap.delete(arr, arr.length - i);
        }
        return arr[0];
    }
}
