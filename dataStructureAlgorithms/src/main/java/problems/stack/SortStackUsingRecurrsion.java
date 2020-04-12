package problems.stack;

import java.util.Stack;

/**
 * @author harshit.mago
 */
public class SortStackUsingRecurrsion {

    private void sortedInsert(Stack<Integer> data, Integer element) {
        if (data.empty()) {
            data.push(element);
            return;
        }

        Integer temp = data.peek();
        if (temp > element) {
            data.pop();
            sortedInsert(data, element);
            data.push(temp);
        } else {
            data.push(element);
        }
    }

    public void sort(Stack<Integer> data) {
        if (data.empty()) {
            return;
        }

        Integer element = data.pop();
        sort(data);
        sortedInsert(data, element);
    }
}
