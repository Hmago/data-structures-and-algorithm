package problems.array.phase3;

import utils.ArrayUtils;

import java.util.Arrays;

public class RearrangePositiveNegativeNumber {

    public static void rearrange(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ArrayUtils.swap(arr, i, temp);
                temp++;
            }
        }


        int i = 0;
        while (i < arr.length) {
            ArrayUtils.swap(arr, i, temp);
            i = i + 2;
            temp++;

            if (arr[i] > 0) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange(arr);
    }
}
