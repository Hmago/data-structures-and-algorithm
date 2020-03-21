package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

public class ReverseLL {

    public <T> SinglyLinkedList<T> reverse(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> current = head, prev = null, next = head.next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
