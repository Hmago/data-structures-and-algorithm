package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import utils.LinkedListUtils;

/*
 * Rearrange a given linked list in-place.
 * Link: https://www.geeksforgeeks.org/rearrange-a-given-linked-list-in-place/
 *
 * Input:  1 -> 2 -> 3 -> 4
 * Output: 1 -> 4 -> 2 -> 3
 */
public class FirstLastArrangement {

    public <T> SinglyLinkedList<T> arrange(SinglyLinkedList<T> head) {
        int middleCount = LinkedListUtils.middleCount(head);
        int size = LinkedListUtils.size(head);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        head = reverseLinkedList.reverse(head, middleCount, size - 1);
        SinglyLinkedList<T> middle = LinkedListUtils.middle(head);

        SinglyLinkedList<T> temp1 = head, temp2 = middle, temp1Next = temp1.next, temp2Next = temp2.next;
        while (temp1Next != middle && temp2Next != null) {
            temp1Next = temp1.next;
            temp2Next = temp2.next;

            temp1.next = temp2;
            temp2.next = temp1Next;

            if (temp1Next != middle) {
                temp1 = temp1Next;
                temp2 = temp2Next;
            }

        }
        temp2.next = temp2Next;

        LinkedListUtils.printSingly(head);
        return head;
    }
}
