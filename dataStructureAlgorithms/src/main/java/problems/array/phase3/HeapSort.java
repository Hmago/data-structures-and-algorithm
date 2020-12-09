package problems.array.phase3;

import java.util.Arrays;

public class HeapSort {

    public static void heapify(int arr[], int size, int parent) {
        int leftChild = 2 * parent + 1;
        int rightChild = 2 * parent + 2;

        int max = parent;
        if (leftChild < size && arr[max] > arr[leftChild]) {
            max = leftChild;
        }

        if (rightChild < size && arr[max] > arr[rightChild]) {
            max = rightChild;
        }

        if (max != parent) {
            int temp = arr[max];
            arr[max] = arr[parent];
            arr[parent] = temp;

            heapify(arr, size, max);
        }
    }

    public static void buildHead(int arr[]) {
        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
    }

    public static int kthLargest(int arr[], int k){
        buildHead(arr);
        for(int i=arr.length-1;i> arr.length-k;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }

        return arr[k];
    }

    public static void sort(int arr[]) {

        buildHead(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7, 0, 2};
        System.out.println(kthLargest(arr, 3));
    }
}
