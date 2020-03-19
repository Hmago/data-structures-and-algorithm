package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

/**
 * Merge two sorted linked lists
 * <p>
 * Link: https://www.geeksforgeeks.org/merge-two-sorted-linked-lists/
 */
public class MergeTwoSortedLL {

    public SinglyLinkedList<Integer> merge(SinglyLinkedList<Integer> head1, SinglyLinkedList<Integer> head2) {
        SinglyLinkedList<Integer> prev = null, temp = null, head = null, h1 = head1, h2 = head2;
        while (h1 != null && h2 != null) {
            if (h1.data < h2.data) {
                temp = h1;
                h1 = h1.next;
            } else {
                temp = h2;
                h2 = h2.next;
            }

            if (prev != null) {
                prev.next = temp;
            } else {
                head = temp;
            }

            prev = temp;
        }

        if (h1 != null) {
            temp.next = h1;
        }

        if (h2 != null) {
            temp.next = h2;
        }
        return head;
    }
}
