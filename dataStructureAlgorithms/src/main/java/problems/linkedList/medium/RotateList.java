package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import utils.LinkedListUtils;

/*
 * Given a linked list, rotate the list to the right by k places
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 *
 * Time complexity: O(n)
 * Space Complexity: O(1)
 */
public class RotateList {

    public <T> SinglyLinkedList<T> rotate(SinglyLinkedList<T> head, int rotate) {
        ReverseLinkedList reverse = new ReverseLinkedList();

        int size = 0;
        SinglyLinkedList<T> temp = head, last = head;
        while (temp != null) {
            size++;
            last = temp;
            temp = temp.next;
        }

        rotate = rotate % size;

        int i = 0;
        temp = head;
        while (i < (size - rotate) - 1) {
            temp = temp.next;
            i++;
        }

        last.next = head;
        head = temp.next;
        temp.next = null;

        return head;
    }
}
