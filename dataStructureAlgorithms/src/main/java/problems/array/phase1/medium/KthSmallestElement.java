package problems.array.phase1.medium;

import dataStructures.MinHeap;

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
