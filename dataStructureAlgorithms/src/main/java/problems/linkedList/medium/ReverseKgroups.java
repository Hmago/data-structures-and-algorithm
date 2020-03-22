package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

/**
 * Reverse a Linked List in groups of given size
 * Input: 1->2->3->4->5->6->7->8->NULL, K = 3
 * Output: 3->2->1->6->5->4->8->7->NULL
 * <p>
 * Link:  https://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
 */
public class ReverseKgroups<T> {

    public SinglyLinkedList<T> reverse(SinglyLinkedList<T> head, int k) {
        int i = 0;
        if (head==null || head.next == null) {
            return head;
        }
        SinglyLinkedList<T> prev = null, current = head, next = head.next;

        while (current != null && i < k) {
            i++;

            current.next = prev;
            prev = current;
            current = next;
            if (current != null) {
                next = current.next;
            }
        }

        head.next = reverse(current, k);
        return prev;
    }
}
