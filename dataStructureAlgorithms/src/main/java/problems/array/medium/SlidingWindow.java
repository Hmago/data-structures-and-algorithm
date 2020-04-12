package problems.array.medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author harshit.mago
 * <p>
 * https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
 * Time: O(n)
 * Space: O(K)
 */
public class SlidingWindow {

    public List<Integer> find(int[] arr, int k) {

        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < k; i++) {

            while (!deque.isEmpty() && arr[deque.peek()] < arr[i]) {
                deque.removeLast();
            }

            deque.addLast(i);
        }

        for (int i = k; i < arr.length; i++) {
            result.add(arr[deque.peek()]);

            while (!deque.isEmpty() && deque.peek() < i - k) {
                deque.removeLast();
            }

            while (!deque.isEmpty() && arr[deque.peek()] < arr[i]) {
                deque.removeLast();
            }

            deque.addLast(i);
            if (i == arr.length - 1) {
                result.add(arr[deque.peek()]);
            }
        }

        return result;
    }
}
