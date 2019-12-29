package algorithms.basic.sort;

import utils.ArrayUtils;

/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class SelectionSort {

    public int[] sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int mind_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mind_index]>arr[j]){
                    mind_index = j;
                }
            }

            ArrayUtils.swap(arr, i, mind_index);
        }
        return arr;
    }
}
