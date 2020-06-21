package problems.array.phase2;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * @author harshit.mago
 */
public class RearrangePositiveAndNegativeNumbers {

    public int[] rearrange(int arr[]) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ArrayUtils.swap(arr, index, i);
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));

        int pos = index, neg = 0;

        // Increment the negative index by 2 and positive index by 1, i.e.,
        // swap every alternate negative number with next positive number
        while (pos < arr.length && neg < pos && arr[neg] < 0)
        {
            ArrayUtils.swap(arr, pos, neg);
            pos++;
            neg += 2;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, -8, -9};

        RearrangePositiveAndNegativeNumbers obj = new RearrangePositiveAndNegativeNumbers();
        System.out.println(Arrays.toString(obj.rearrange(arr)));
    }
}
