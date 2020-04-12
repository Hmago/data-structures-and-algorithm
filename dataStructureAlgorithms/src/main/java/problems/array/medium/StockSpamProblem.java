package problems.array.medium;

import java.util.Arrays;

/**
 * @author harshit.mago
 */
public class StockSpamProblem {

    public int[] spam(int[] arr) {
        int ans[] = new int[arr.length];

        ans[0] = 1;
        int n = arr.length;
        // Calculate span values for rest of the elements
        for (int i = 1; i < n; i++) {
            int counter = 1;
            while ((i - counter) >= 0 && arr[i] >= arr[i - counter]) {
                counter += ans[i - counter];
            }
            ans[i] = counter;
        }

        return ans;
    }
}
