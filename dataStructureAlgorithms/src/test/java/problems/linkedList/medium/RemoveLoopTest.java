package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class RemoveLoopTest {

    private RemoveLoop obj = new RemoveLoop();

    @Test
    public void test1(){
        Integer inputData[] = {1, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        SinglyLinkedList<Integer> temp = new SinglyLinkedList<>(2);
        temp.next = head1.next;
        head1.next.next.next.next = temp;
        head1.next = temp;

        System.out.println("==starts");
        obj.remove(head1);

        LinkedListUtils.printSingly(head1);
    }
}
