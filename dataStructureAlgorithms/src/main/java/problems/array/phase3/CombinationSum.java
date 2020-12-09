package problems.array.phase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void find(int arr[], List<List<Integer>> res, List<Integer> r, int originalSum, int sum, int i) {
        if (sum == 0) {
            res.add(r);
            return;
        }

        if (sum < arr[i]) {
            return;
        }


        while (i < arr.length && sum - arr[i] <= sum) {
            r.add(arr[i]);

            find(arr, res, r, originalSum, sum - arr[i], i);
            if (sum - arr[i] == 0) {
                r = new ArrayList<>();
                sum = originalSum;
            } else {
                r.remove(r.size() - 1);
            }
            i++;
        }

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7};

        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        find(arr, res, r, 7, 7, 0);

        res.stream().forEach(k -> Arrays.toString(k.toArray()));
    }
}
