package problems.array.phase1.easy;

/**
 * Sort an array of 0s, 1s and 2s
 * <p>
 * link: https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */
public class Sort012 {

    public void sort(int arr[]) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            }

            if (arr[i] == 1) {
                one++;
            }

            if (arr[i] == 2) {
                two++;
            }
        }

        int index = 0;
        while (zero > 0) {
            arr[index++] = 0;
            zero--;
        }

        while (one > 0) {
            arr[index++] = 1;
            one--;
        }

        while (two > 0) {
            arr[index++] = 2;
            two--;
        }
    }
}
