package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

public class MergeTwoLLAlternate {

    public <T> SinglyLinkedList<T> merge(SinglyLinkedList<T> head1, SinglyLinkedList<T> head2) {
        SinglyLinkedList<T> temp1 = head1;
        SinglyLinkedList<T> temp2 = head2;

        SinglyLinkedList<T> head, temp;

        temp = head1;
        head = head1;
        while (temp1 != null && temp2 != null) {
            temp = temp1;
            temp1 = temp1.next;
            temp.next = temp2;
            temp = temp2;
            temp2 = temp2.next;
            temp.next = temp1;
        }

        if (temp2 != null) {
            temp.next = temp2;
        }

        return head;
    }
}
