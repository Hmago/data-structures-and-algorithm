package problems.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author harshit.mago
 * <p>
 * Next greater to left
 */
public class StockSpanProblem {

    public int[] find(int arr[]) {
        int aout[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                aout[i] = i + 1;
            } else {
                aout[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return aout;
    }

    public static void main(String[] args) {
        int arr[] = {10, 4, 5, 90, 120, 80};

        StockSpanProblem obj = new StockSpanProblem();
        int out[] = obj.find(arr);
        System.out.println(Arrays.toString(out));
    }
}
