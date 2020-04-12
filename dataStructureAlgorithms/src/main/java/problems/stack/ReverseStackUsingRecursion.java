package problems.stack;

import dataStructures.SinglyStack;

import java.util.Stack;

/*
 * Reverse a stack using recursion
 * Link: https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
 *
 * Time:O(n2), Space:O(1)
 */
public class ReverseStackUsingRecursion {

    private void insertAtBottom(Stack<Integer> data, Integer element) {
        if (data.empty()) {
            data.push(element);
            return;
        }

        Integer temp = data.pop();
        insertAtBottom(data, element);
        data.push(temp);
    }

    public void reverse(Stack<Integer> data) {
        if (data.empty()) {
            return;
        }

        Integer element = data.pop();
        reverse(data);
        insertAtBottom(data, element);
    }
}
