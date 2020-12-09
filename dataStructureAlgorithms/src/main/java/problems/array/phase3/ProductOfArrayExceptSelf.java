package problems.array.phase3;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void printProductExceptSelf(int arr[]) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = left[i] * right[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        printProductExceptSelf(arr);
    }
}
