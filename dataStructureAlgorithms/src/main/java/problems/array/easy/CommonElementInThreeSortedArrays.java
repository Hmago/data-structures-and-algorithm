package problems.array.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Find common elements in three sorted arrays
 * ar1[] = {1, 5, 10, 20, 40, 80}
    ar2[] = {6, 7, 20, 80, 100}
    ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
    Output: 20, 80
  *
  * Link: geeksforgeeks.org/find-common-elements-three-sorted-arrays/
 */
public class CommonElementInThreeSortedArrays {

    public List<Integer> intersection(int arr1[], int arr2[], int arr3[]) {
        int i = 0, j = 0, k = 0;

        List<Integer> intersection = new ArrayList<>();
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                intersection.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j] && arr1[i] < arr3[k]) {
                i++;
            } else if (arr2[j] < arr1[i] && arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        return intersection;
    }
}
