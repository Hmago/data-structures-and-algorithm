package problems.stack;

import dataStructures.SinglyLinkedList;

/**
 * Design a stack that supports getMin() in O(1) time and O(1) extra space
 * <p>
 * Consider the following SpecialStack
 * 16  --> TOP
 * 15
 * 29
 * 19
 * 18
 * <p>
 * When getMin() is called it should return 15,
 * which is the minimum element in the current stack.
 * <p>
 * If we do pop two times on stack, the stack becomes
 * 29  --> TOP
 * 19
 * 18
 * <p>
 * When getMin() is called, it should return 18
 * which is the minimum in the current stack.
 * <p>
 * Link: https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/, https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/
 */
public class StackWithGetMin {

    private SinglyLinkedList<Integer> head;
    private SinglyLinkedList<Integer> minValue_head;

    int maxSize = 0;

    int currentSize = 0;
    public StackWithGetMin(int maxSize) {
        this.maxSize = maxSize;
    }

    public boolean push(int data) {
        if (currentSize > maxSize) {
            System.out.println("Stack Overflow");
            return false;
        }
        /* Adding data into the stack */
        SinglyLinkedList<Integer> newNode = new SinglyLinkedList<>(data);
        newNode.next = head;
        head = newNode;
        currentSize++;

        /* Maintaining the min stack */
        if (minValue_head==null || data < minValue_head.data) {
            SinglyLinkedList<Integer> newMinNode = new SinglyLinkedList<>(data);
            newMinNode.next = minValue_head;
            minValue_head = newMinNode;
        }
        return true;
    }

    public boolean pop() {
        if (currentSize < 1) {
            System.out.println("stack is empty");
            return false;
        }
        /* Removing from the main stack */
        int data = head.data;
        head = head.next;

        /* removing from min stack */
        if (data == minValue_head.data) {
            minValue_head = minValue_head.next;
        }
        return true;
    }

    public int getMin() {
        return minValue_head.data;
    }
}
