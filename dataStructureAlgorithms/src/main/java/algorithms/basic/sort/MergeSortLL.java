package algorithms.basic.sort;

import dataStructures.SinglyLinkedList;
import utils.LinkedListUtils;

public class MergeSortLL {

    public <T extends Comparable> SinglyLinkedList<T> sort(SinglyLinkedList<T> head) {
        if (head == null || head.next == null) {
            return head;
        }

        SinglyLinkedList<T> middle = LinkedListUtils.middle(head);
        SinglyLinkedList<T> nextToMiddle = middle.next;

        middle.next = null;
        SinglyLinkedList<T> left = sort(head);
        SinglyLinkedList<T> right = sort(nextToMiddle);

        return merge(left, right);

    }

    private <T extends Comparable> SinglyLinkedList<T> merge(SinglyLinkedList<T> left, SinglyLinkedList<T> right) {

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        SinglyLinkedList<T> result;
        if (left.data.compareTo(right.data) < 0) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }
}
