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

    /**
     * @param head
     * @param from: starts from 0
     * @param end:  last is n-1
     * @param <T>
     * @return
     */
    public <T> SinglyLinkedList<T> reverse(SinglyLinkedList<T> head, int from, int end) {
        if (from == 0) {
            return reverse(head, end+1);
        }

        int i = 0;
        SinglyLinkedList<T> originalHead = head;
        while (i < from - 1) {
            head = head.next;
            i++;
        }

        SinglyLinkedList<T> temp = head;
        head = head.next;
        SinglyLinkedList<T> prevElement = null, currentElement = head, nextElement = head.next;
        i = 1;
        while (nextElement != null && i < end) {
            currentElement.next = prevElement;
            prevElement = currentElement;
            currentElement = nextElement;
            nextElement = nextElement.next;

            i++;
        }

        currentElement.next = prevElement;
        head.next = nextElement;
        temp.next = currentElement;
        return originalHead;
    }
}
