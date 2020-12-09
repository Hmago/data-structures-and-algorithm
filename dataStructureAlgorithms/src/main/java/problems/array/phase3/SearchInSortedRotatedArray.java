package problems.array.phase3;

public class SearchInSortedRotatedArray {

    public static int search(int arr[], int left, int right, int x) {
        if (right < left) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (arr[mid] == x) {
            return mid;
        }

        if (arr[left] < arr[mid]) {
            if (arr[left] <= x && x < arr[mid]) {
                return search(arr, left, mid - 1, x);
            } else {
                return search(arr, mid + 1, right, x);
            }
        } else {
            if (arr[mid] < x && arr[right] >= x) {
                return search(arr, mid + 1, right, x);
            } else {
                return search(arr, left, mid - 1, x);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            int index = search(arr, 0, arr.length - 1, arr[i]);
            System.out.println("Searching number = " + arr[i] + " Index at " + index + ", correct=" + (i == index));

        }
    }
}
