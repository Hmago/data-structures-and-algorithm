package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

import java.util.HashMap;

/*
 * Sorted: Remove duplicates from a sorted linked list
 * Link: https://www.geeksforgeeks.org/remove-duplicates-from-a-sorted-linked-list/
 * Time Complexity: O(n), Space Complexity:O(1)
 *
 * UnSorted: Remove duplicates from an unsorted linked list
 * Link: https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
 * Time Complexity: O(n), Space Complexity:O(n)
 */
public class RemoveDuplicateFromLinkedList {

    public <T> SinglyLinkedList<T> removeDuplicateFromSortedLL(SinglyLinkedList<T> head) {
        if (head == null) {
            return null;
        }

        SinglyLinkedList<T> temp = head, nextElement = temp.next;
        while (nextElement != null) {
            if (temp.data == nextElement.data) {
                temp.next = nextElement.next;
            }

            temp = temp.next;
            nextElement = temp == null ? null : temp.next;
        }

        return head;
    }

    public <T> SinglyLinkedList<T> removeDuplicateFromUnsortedLL(SinglyLinkedList<T> head) {
        if (head == null) {
            return null;
        }

        SinglyLinkedList<T> temp = head, nextElement = temp.next;
        HashMap<T, Boolean> hm = new HashMap<>();
        hm.put(temp.data, true);
        while (nextElement != null) {
            if (hm.containsKey(nextElement.data)) {
                temp.next = temp.next.next;
                nextElement = temp == null ? null : temp.next;
                continue;
            }

            hm.put(nextElement.data, true);
            temp = temp.next;
            nextElement = temp == null ? null : temp.next;
        }

        return head;
    }
}
