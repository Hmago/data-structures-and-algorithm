package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

/**
 * Detect and Remove Loop in a Linked List
 * link: https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 * <p>
 * Time: O(n2), Space: O(1)
 */
public class RemoveLoop {

    public void remove(SinglyLinkedList<Integer> head) {
        boolean loopExists = false;

        SinglyLinkedList<Integer> slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                loopExists = true;
                break;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        if (!loopExists) {
            return;
        }

        fast = fast.next;
        int loopSize = 1;
        while (fast != slow) {
            loopSize++;
            fast = fast.next;
        }

        System.out.println("loop size=="+loopSize);
        slow = head;
        SinglyLinkedList<Integer> temp = head.next;
        while (true) {
            temp = slow.next;
            for (int i = 0; i < loopSize; i++) {
                if (temp.next == slow) {
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            }

            slow = slow.next;
        }

    }
}
