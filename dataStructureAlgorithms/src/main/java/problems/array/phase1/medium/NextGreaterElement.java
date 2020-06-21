package problems.array.phase1.medium;

import java.util.Arrays;
import java.util.Stack;

/*
 * Next Greater Element
 * input array [4, 5, 2, 25}
 * Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
   *
   * Link: https://www.geeksforgeeks.org/next-greater-element/
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
 */
public class NextGreaterElement {

    private class Data {
        int index = -1;
        int value;

        public Data(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public int[] find(int arr[]) {
        int output[] = new int[arr.length];
        Arrays.fill(output, -1);

        Stack<Data> stack = new Stack<>();
        stack.push(new Data(0, arr[0]));
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            if (!stack.empty()) {
                Data top = stack.pop();
                while (element > top.value) {
                    output[top.index] = element;
                    if (stack.empty()) {
                        break;
                    }

                    top = stack.pop();
                }

                if (element < top.value) {
                    stack.push(top);
                }
            }

            stack.push(new Data(i, element));
        }

        return output;
    }
}
