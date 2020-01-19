package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

/*
 * Reverse Linked List
 *
 * Input: 1->2->3->4->NULL
 * Output: 4->3->2->1->NULL
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class ReverseLinkedList {

    public <T> SinglyLinkedList<T> reverse(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> prevElement = null, currentElement = head, nextElement = head.next;
        while (nextElement != null) {
            currentElement.next = prevElement;
            prevElement = currentElement;
            currentElement = nextElement;
            nextElement = nextElement.next;
        }

        currentElement.next = prevElement;
        return currentElement;
    }

    public <T> SinglyLinkedList<T> reverse(SinglyLinkedList<T> head, int limit) {
        SinglyLinkedList<T> prevElement = null, currentElement = head, nextElement = head.next;
        int i = 1;
        while (nextElement != null && i < limit) {
            currentElement.next = prevElement;
            prevElement = currentElement;
            currentElement = nextElement;
            nextElement = nextElement.next;

            i++;
        }

        currentElement.next = prevElement;
        head.next = nextElement;
        return currentElement;
    }
}
