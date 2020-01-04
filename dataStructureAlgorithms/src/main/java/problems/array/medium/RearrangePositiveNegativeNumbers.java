package problems.array.medium;

import utils.ArrayUtils;

import java.util.Arrays;

/*
 * Rearrange positive and negative numbers in O(n) time and O(1) extra space
 * For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]
 *
 */
public class RearrangePositiveNegativeNumbers {

    public int[] rearrange(int arr[]) {
        int lastNegativeIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                lastNegativeIndex++;
                ArrayUtils.swap(arr, i, lastNegativeIndex);
            }
        }

        int left = 0, right = lastNegativeIndex+1;
        while (arr[left] < 0 && right < arr.length) {

            ArrayUtils.swap(arr, left, right);
            left = left + 2;
            right++;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
//
//    public static void main(String[] args) {
//        int arr[] = {-1, 2, -3, 4, 5, 6, -7, -8, -9};
//
//        RearrangePositiveNegativeNumbers obj = new RearrangePositiveNegativeNumbers();
//        obj.rearrange(arr);
//    }
}
