package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import utils.LinkedListUtils;

import java.util.LinkedList;

/**
 * Function to check if a singly linked list is palindrome
 * NITIN
 * <p>
 * Link: https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Palindrome {

    public boolean isIt(SinglyLinkedList<Character> head) {
        int size = LinkedListUtils.size(head);
        int middleCount = LinkedListUtils.middleCount(head);
        SinglyLinkedList<Character> middle = LinkedListUtils.middle(head);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        if (size % 2 != 0) {
            middle = middle.next;
            head = reverseLinkedList.reverse(head, middleCount + 1);
            head = head.next;
        } else {
            head = reverseLinkedList.reverse(head, middleCount);
        }
        LinkedListUtils.printSingly(head);

        while (middle != null) {
            if (!head.data.equals(middle.data)) {
                return false;
            }
            middle = middle.next;
            head = head.next;
        }

        return true;
    }
}
