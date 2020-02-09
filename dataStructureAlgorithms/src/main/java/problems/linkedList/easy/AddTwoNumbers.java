package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

public class AddTwoNumbers {

    public int add(SinglyLinkedList<Integer> head1, SinglyLinkedList<Integer> head2) {
        int num1 = 0, num2 = 0, p1 = 1;
        while (head1 != null) {
            num1 = num1 + (head1.data * p1);
            p1 = p1 * 10;
            head1 = head1.next;
        }

        p1 = 1;
        while (head2 != null) {
            num2 = num2 + (head2.data * p1);
            head2 = head2.next;
            p1 = p1 * 10;
        }

        return (num1 + num2);
    }
}
