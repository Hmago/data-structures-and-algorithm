package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

public class NthNodeFromLast {

    public int find(SinglyLinkedList<Integer> head, int n){
        int size=0;
        SinglyLinkedList<Integer> temp = head;
        while (temp!=null){
            size++;
            temp = temp.next;
        }

        temp = head;
        int loop = size-n;
        while (loop>0){
            temp = temp.next;
            loop--;
        }

        return temp.data;
    }
}
