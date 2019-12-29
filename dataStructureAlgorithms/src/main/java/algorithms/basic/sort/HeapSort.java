package algorithms.basic.sort;

import utils.ArrayUtils;

import java.util.Arrays;

public class HeapSort {

    public int[] sort(int arr[]){
        int size = arr.length;
        for(int i=size/2-1; i>=0; i--){
            heapify(arr, size, i);
        }

        for(int i=size-1;i>=0;i--){
            ArrayUtils.swap(arr, 0, i);
            heapify(arr, i, 0);
        }
        
        return arr;
    }

    private void heapify(int arr[], int size, int parent_index){
        int max_index = parent_index;
        int left_child = 2*parent_index+1;
        int right_child = 2*parent_index+2;
        if(left_child<size && arr[left_child]>arr[max_index]){
            max_index = left_child;
        }

        if(right_child<size && arr[right_child]>arr[max_index]){
            max_index = right_child;
        }

        if(max_index!=parent_index){
            ArrayUtils.swap(arr, max_index, parent_index);
            heapify(arr, size, max_index);
        }
    }

}
