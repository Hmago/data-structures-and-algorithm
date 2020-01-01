package problems.array.easy;

import utils.ArrayUtils;

/*
 * Convert array into Zig-Zag fashion
 * Input: arr[] = {4, 3, 7, 8, 6, 2, 1}
 *   Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
 *
 * Link: https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
 */
public class RerrangeElementsInZigZag {

    public int[] rearrange(int arr[]){
        boolean flag = true;
        for(int i=1;i<arr.length;i++){
            if(flag){
                if(arr[i-1]>arr[i]){
                    ArrayUtils.swap(arr, i, i-1);
                }
            }else{
                if(arr[i-1]<arr[i]){
                    ArrayUtils.swap(arr, i, i-1);
                }
            }
            flag = !flag;
        }

        return arr;
    }
}
