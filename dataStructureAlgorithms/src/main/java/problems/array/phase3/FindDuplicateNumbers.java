package problems.array.phase3;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbers {

    public static Set<Integer> find(int arr[]) {
        Set<Integer> output = new HashSet<>();

        for (int i : arr) {
            if (arr[Math.abs(i)] < 0) {
                output.add(Math.abs(i));
            }

            arr[Math.abs(i)] = -1 * arr[Math.abs(i)];
        }

        return output;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 3, 6, 6};
        Set<Integer> output = find(arr);
        output.stream().forEach(k-> System.out.println(k));
    }
}
