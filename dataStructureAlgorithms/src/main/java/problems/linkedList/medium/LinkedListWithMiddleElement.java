package problems.linkedList.medium;

import dataStructures.DoublyLinkedList;

/**
 * Design a stack with operations on middle element
 * <p>
 * How to implement a stack which will support following operations in O(1) time complexity?
 * 1) push() which adds an element to the top of stack.
 * 2) pop() which removes an element from top of stack.
 * 3) findMiddle() which will return middle element of the stack.
 * 4) deleteMiddle() which will delete the middle element.
 * <p>
 * Link: https://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation/
 */
public class LinkedListWithMiddleElement {

    private int size = 0;

    private DoublyLinkedList<Integer> head;
    private DoublyLinkedList<Integer> middle;

    private void moveRight() {
        if (size == 1) {
            middle = head;
        }

        if (size>2 && size % 2 != 0) {
            middle = middle.prev;
        }
    }

    private void moveLeft() {
        if (size == 1) {
            middle = head;
        }

        if (size % 2 == 0) {
            middle = middle.next;
        }
    }

    public void push(int data) {
        size++;
        if (head == null) {
            head = new DoublyLinkedList<>(data);
            moveRight();
            return;
        }

        DoublyLinkedList<Integer> newNode = new DoublyLinkedList<>(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        moveRight();
    }

    public void pop() {
        if (head != null) {
            size--;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }

            moveLeft();
        }
    }

    public int getMiddle() {
        if (middle != null) {
            return middle.data;
        }

        return -1;
    }
}
