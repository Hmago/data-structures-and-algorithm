package problems.array.easy;

import java.util.HashMap;

/*
 * Check if a given array contains duplicate elements within k distance from each other
 *
 * Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
    Output: false
    All duplicates are more than k distance away.
  *
  * Link: https://www.geeksforgeeks.org/check-given-array-contains-duplicate-elements-within-k-distance/
 */
public class CheckDuplicateWithinKElements {

    public boolean containsDuplicate(int arr[], int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        if (arr.length < k) {
            return false;
        }


        for (int i = 0; i < arr.length; i++) {
            if (i - k > -1) {
                if (hmap.containsKey(arr[i])) {
                    return true;
                }


                
                hmap.remove(arr[i - k]);
            }
            hmap.put(arr[i], arr[i]);
        }

        return false;
    }

}
