package problems.linkedList.medium;

import dataStructures.DoublyLinkedList;

/*
 * Design a stack with operations on middle element
 *  operations in O(1) time complexity
 * 1) push() which adds an element to the top of stack.
 * 2) pop() which removes an element from top of stack.
 * 3) findMiddle() which will return middle element of the stack.
 * 4) deleteMiddle() which will delete the middle element.
 */
public class OperationOnMiddleElement<T> {

    private int size = 0;
    private DoublyLinkedList<T> head;
    private DoublyLinkedList<T> middle;

    public DoublyLinkedList<T> push(T data) {
        size++;

        DoublyLinkedList<T> newNode = DoublyLinkedList.createNode(data);
        if (head == null) {
            head = newNode;
            middle = head;
            return head;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        if (size > 1 && size % 2 != 0) {
            middle = middle.prev;
        }

        return head;
    }

    public DoublyLinkedList<T> pop() {
        size--;
        head = head.next;
        head.prev = null;
        if (size % 2 != 0) {
            middle = middle.next;
        }

        return head;
    }

    public T findMiddle() {
        return middle.data;
    }

    public DoublyLinkedList<T> deleteMiddle() {
        if (size % 2 == 0) {
            middle = middle.prev;
            middle.next = middle.next.next;
            middle.next.prev = middle;
        } else {
            middle = middle.next;
            middle.prev = middle.prev.prev;
            middle.prev.next = middle;
        }

        size--;
        return head;
    }
}
