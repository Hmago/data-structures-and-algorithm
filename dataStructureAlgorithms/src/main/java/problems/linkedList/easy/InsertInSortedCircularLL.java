package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import utils.LinkedListUtils;

/*
 * Sorted insert for circular linked list
 *
 * link: geeksforgeeks.org/sorted-insert-for-circular-linked-list/
 *
 * Time: O(n), space: O(1)
 */
public class InsertInSortedCircularLL {

    public SinglyLinkedList<Integer> insert(SinglyLinkedList<Integer> head, int value) {
        SinglyLinkedList<Integer> newNode = SinglyLinkedList.createNode(value);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        if (head.data > value) {
            SinglyLinkedList<Integer> lastNode = LinkedListUtils.lastNodeInCircularSinglyLL(head);
            newNode.next = head;
            lastNode.next = newNode;
            head = newNode;
            return head;
        }

        SinglyLinkedList<Integer> temp = head;
        while (temp.next.data < value && temp.next != head) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}
