package utils;

public class ArrayUtils {

    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void print2D(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int sum(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }

        return sum;
    }

    public static int[] reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        return arr;
    }
}
