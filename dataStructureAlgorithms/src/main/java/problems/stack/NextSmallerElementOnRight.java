package problems.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author harshit.mago
 */
public class NextSmallerElementOnRight {

    public int[] find(int arr[]) {
        int out[] = new int[arr.length];

        Stack<Integer> data = new Stack<>();
        for (int i = arr.length - 1; i > -1; i--) {
            while (!data.empty() && data.peek() > arr[i]) {
                data.pop();
            }

            if (data.isEmpty()) {
                out[i] = 0;
            } else {
                out[i] = data.peek();
            }

            data.push(arr[i]);
        }

        return out;
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, 20, 4, 5};

        NextSmallerElementOnRight obj = new NextSmallerElementOnRight();
        int out[] = obj.find(arr);
        System.out.println(Arrays.toString(out));
    }
}
