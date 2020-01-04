package problems.array.easy;

import utils.ArrayUtils;

import java.util.Arrays;

/*
 * Sort an array in wave form
 * Given an unsorted array of integers, sort the array into a wave like array. An array ‘arr[0..n-1]’ is sorted in wave form
 *  if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 *
 * Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 * Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR
 *                {20, 5, 10, 2, 80, 6, 100, 3} OR
 *               any other array that is in wave form
 */
public class ArrayInWaveForm {

    public int[] transform(int arr[]) {
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (flag) {
                if (arr[i - 1] < arr[i]) {
                    ArrayUtils.swap(arr, i - 1, i);
                }
            } else {
                if (arr[i - 1] > arr[i]) {
                    ArrayUtils.swap(arr, i - 1, i);
                }
            }
            flag=!flag;
        }

        return arr;
    }
}
