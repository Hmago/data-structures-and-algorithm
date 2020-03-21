package dataStructures;

import utils.ArrayUtils;

public class MinHeap {

    private void minHeapify(int arr[], int parent, int length) {
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;

        int min = parent;
        if (left >= length) {
            return;
        } else if (right >= length) {
            min = left;
        } else {
            min = arr[left] < arr[right] ? left : right;
        }

        if (arr[min] < arr[parent]) {
            ArrayUtils.swap(arr, min, parent);
            minHeapify(arr, min, length);
        }
    }

    public void minHeap(int arr[]) {
        for (int i = (arr.length) / 2; i >= 0; i--) {
            minHeapify(arr, i, arr.length);
        }
    }

    public void delete(int arr[], int length) {
        ArrayUtils.swap(arr, 0, length - 1);
        minHeapify(arr, 0, length - 2);
    }
}
