package utils;

import dataStructures.SinglyLinkedList;

public class LinkedListUtils {

    /*
     * Prints singly linked list
     */
    public static <T> void printSingly(SinglyLinkedList<T> head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println();
    }

    /*
     * Create SinglyLinkedList from Array
     * input data[] =  {1,2,3,4}
     * output head: 1->2->3->4->null
     */
    public static <T> SinglyLinkedList<T> createSinglyFromArray(T[] data) {
        if (data == null || data.length == 0) {
            return null;
        }

        SinglyLinkedList<T> head = SinglyLinkedList.createNode(data[0]), temp = head, nextElement;
        for (int i = 1; i < data.length; i++) {
            nextElement = SinglyLinkedList.createNode(data[i]);
            temp.next = nextElement;
            temp = temp.next;
        }

        return head;
    }

    /*
     * Checks if two Singly linked list are equal or not
     */
    public static <T> boolean isEqual(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        while (list1 != null || list2 != null) {
            if (list1 == null || list2 == null) {
                return false;
            } else if (!list1.data.equals(list2.data)) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }

    /*
     * Swap data of two LinkedListNodes
     */
    public static <T> void swap(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        T temp = list1.data;
        list1.data = list2.data;
        list2.data = temp;
    }
}
