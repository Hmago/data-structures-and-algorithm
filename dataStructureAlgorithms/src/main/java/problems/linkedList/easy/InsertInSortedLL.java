package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

public class InsertInSortedLL {

    public SinglyLinkedList<Integer> insert(SinglyLinkedList<Integer> head, int data) {
        if (head == null) {
            return SinglyLinkedList.createNode(data);
        }

        SinglyLinkedList<Integer> newNode = SinglyLinkedList.createNode(data);
        if (head.data > data) {
            newNode.next = head;
            return newNode;
        }

        SinglyLinkedList<Integer> prev = head, current = head.next;
        while ((current != null) && (current.data < data)) {
            prev = prev.next;
            current = current.next;
        }

        newNode.next = current;
        prev.next = newNode;

        return head;
    }
}
