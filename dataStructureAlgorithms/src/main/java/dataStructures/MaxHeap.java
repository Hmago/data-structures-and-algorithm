package dataStructures;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Link: https://www.youtube.com/watch?v=HqPJF2L5h9U
 * <p>
 * Create Heap: O(nLog(n))
 * Delete: O(nLog(n))
 * Heapify: O(n)
 */
public class MaxHeap {

    private void fixBottomToUp(int heap[], int i) {
        if (i < 1) {
            return;
        }

        int parent = i / 2;
        if (heap[parent] < heap[i]) {
            ArrayUtils.swap(heap, parent, i);
        }

        fixBottomToUp(heap, i / 2);
        return;
    }

    private void fixTopToBottom(int heap[], int current, int size) {
        if (current >= size || 2 * current >= size) {
            return;
        }

        int left = current * 2 + 1;
        int right = (2 * current) + 2;
        int max = left;
        if (right < size && heap[right] > heap[left]) {
            max = right;
        }

        if (heap[current] < heap[max]) {
            ArrayUtils.swap(heap, current, max);
            fixTopToBottom(heap, max, size);
        }
    }

    public void delete(int heap[]) {
        ArrayUtils.swap(heap, 0, heap.length - 1);
        fixTopToBottom(heap, 0, heap.length - 1);
    }

    public int[] createHeap(int arr[]) {
        int heap[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            heap[i] = arr[i];
            fixBottomToUp(heap, i);
        }

        return heap;
    }

    public void heapify(int arr[]) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            fixTopToBottom(arr, i, arr.length);
        }
    }

    public static void main(String[] args) {

        MaxHeap maxHeap = new MaxHeap();
        int arr[] = {2, 3, 1, 4, 9, 8};
        int result[] = maxHeap.createHeap(arr);
        System.out.println(Arrays.toString(result));
        maxHeap.delete(result);
        System.out.println(Arrays.toString(result));

        int arr2[] = {2, 3, 1, 4, 9, 8};
        maxHeap.heapify(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
