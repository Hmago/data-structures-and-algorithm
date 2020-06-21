package problems.array.phase2;

import utils.ArrayUtils;

/**
 * @author harshit.mago
 */
public class ReversalAlgorithmArrayRotation {

    public int[] rotate(int arr[], int d) {
        /* case where d is greater than the length of the array */
        d = d % arr.length;
        if (d == 0) {
            return arr;
        }

        ArrayUtils.reverse(arr, 0, d - 1);
        ArrayUtils.reverse(arr, d, arr.length - 1);

        ArrayUtils.reverse(arr, 0, arr.length - 1);
        return arr;
    }

}
