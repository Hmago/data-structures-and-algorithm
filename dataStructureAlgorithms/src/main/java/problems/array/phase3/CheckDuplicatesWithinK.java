package problems.array.phase3;

import java.util.HashSet;

public class CheckDuplicatesWithinK {

    public static boolean exists(int arr[], int k) {
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.contains(arr[i])) {
                return true;
            }

            if (i >= k) {
                map.remove(arr[i - k]);
            }

            map.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5};
        System.out.println(exists(arr, 3));
    }
}
