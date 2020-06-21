package problems.array.phase1.easy;

/*
 * Rearrange an array in maximum minimum form
 * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
 * Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
 *
 * Link: https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/
 * Time: O(n)
 * Space: O(n)
 */
public class RearrangeInMinMaxForm {

    public int[] rearrange(int arr[]) {
        int output[] = new int[arr.length];
        int i = 0, j = arr.length - 1, k = 0;
        while (k < arr.length && i <= j) {
            output[k++] = arr[j--];
            if (k < arr.length) {
                output[k++] = arr[i++];
            }
        }

        return output;
    }
}
