package algorithms.basic.sort;

public class MergeSort {
    /*
     * Divide the array and then sort
     *
     * Time Complexity:
     *      Best, Avg, Worst case: O( n log(n) )
     *
     * Space Complexity: O(n)
     *
     */

    public int[] sort(int arr[]) {
        return sort(arr, 0, arr.length - 1);
    }

    private int[] sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            sortThenMerge(arr, left, mid, right);
        }

        return arr;
    }

    private void sortThenMerge(int arr[], int left, int mid, int right) {
        int size1 = mid - left + 1;
        int size2 = right - mid;

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        for (int i = 0; i < size1; i++) {
            arr1[i] = arr[left + i];
        }

        for (int i = 0; i < size2; i++) {
            arr2[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0, k = left;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < size1) {
            arr[k] = arr1[i];
            k++;
            i++;
        }

        while (j < size2) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
    }
}
