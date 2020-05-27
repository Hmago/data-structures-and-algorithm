package problems.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author harshit.mago
 */
public class NextGreaterElementOnLeft {


    public int[] find(int arr[]) {

        int out[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.empty() && stack.peek() < arr[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                out[i] = 0;
            }else{
                out[i] = stack.peek();
            }

            stack.push(arr[i]);

        }
        return out;
    }


    public static void main(String[] args) {
//        int arr[] = {3, 2, 4, 1, 6};
//
//        NextGreaterElementOnLeft obj = new NextGreaterElementOnLeft();
//        int out[] = obj.find(arr);
//        System.out.println(Arrays.toString(out));

        int arr[] = {10, 2, 20, 4, 5};

        NextGreaterElementOnLeft obj = new NextGreaterElementOnLeft();
        int out[] = obj.find(arr);
        System.out.println(Arrays.toString(out));
    }
}
