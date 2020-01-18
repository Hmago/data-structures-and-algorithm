package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

/*
 * Find the middle of a given linked list
 * Time Complexity: O(n), space: O(1)
 */
public class FindMiddleInLL {

    public <T> T find(SinglyLinkedList<T> head) {
        if (head == null) {
            return null;
        }

        SinglyLinkedList<T> slow = head, fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next == null ? null : fast.next.next;
        }

        return slow.data;
    }
}
