package problems.array.phase2;

/**
 * @author harshit.mago
 */
public class SearchInSortedAndRotated {

    public int search(int arr[], int start, int end, int x) {
        if (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[start] < arr[mid]) {
                // left is sorted
                if (arr[start] <= x && x < arr[mid]) {
                    // go left
                    return search(arr, start, mid - 1, x);
                } else {
                    // go right
                    return search(arr, mid + 1, end, x);
                }

            } else {
                //right is sorted
                if (arr[mid] < x && arr[end] <= x) {
                    // go right
                    return search(arr, mid + 1, end, x);
                } else {
                    // go left
                    return search(arr, start, mid - 1, x);
                }
            }
        }

        return -1;
    }
}
