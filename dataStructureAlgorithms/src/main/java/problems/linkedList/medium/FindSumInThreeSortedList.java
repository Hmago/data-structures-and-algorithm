package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

/**
 * Find a triplet from three linked lists with sum equal to a given number
 * <p>
 * Given three linked lists, say a, b and c, find one node from each list such that the sum of the values of the nodes is equal to a given number.
 * For example, if the three linked lists are 12->6->29, 23->5->8 and 90->20->59, and the given number is 101, the output should be tripel “6 5 90”.
 * <p>
 * Making small change here: Input is sorted
 */
public class FindSumInThreeSortedList {


    boolean doesExist(int requiredSum, SinglyLinkedList<Integer> list1, SinglyLinkedList<Integer> list2, SinglyLinkedList<Integer> list3) {
        SinglyLinkedList<Integer> temp1 = list1;

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        list3 = reverseLinkedList.reverse(list3);

        int sum = 0;
        while (temp1 != null) {
            SinglyLinkedList<Integer> temp2 = list2;
            SinglyLinkedList<Integer> temp3 = list3;

            while (temp2.next != null && temp3.next != null) {
                sum = temp1.data + temp2.data + temp3.data;
                if (sum == requiredSum) {
                    return true;
                }

                if (sum < requiredSum) {
                    temp2 = temp2.next;
                } else {
                    temp3 = temp3.next;
                }
            }

            SinglyLinkedList<Integer> temp20 = temp2;
            while (temp20 != null) {
                sum = temp1.data + temp20.data + temp3.data;
                if (sum == requiredSum) {
                    return true;
                }
                temp20 = temp20.next;
            }

            while (temp3 != null) {
                sum = temp1.data + temp2.data + temp3.data;
                if (sum == requiredSum) {
                    return true;
                }

                temp3 = temp3.next;
            }

            temp1 = temp1.next;
        }
        return false;
    }
}
