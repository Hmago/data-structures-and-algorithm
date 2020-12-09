package problems.array.phase3;

import utils.ArrayUtils;

import java.util.Arrays;

public class RotateArrayByNTimes {

    public static void rotate(int arr[], int d){
        ArrayUtils.reverse(arr, 0, d-1);
        ArrayUtils.reverse(arr, d, arr.length-1);
        ArrayUtils.reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        rotate(arr, 2);

        System.out.println(Arrays.toString(arr));
    }
}
