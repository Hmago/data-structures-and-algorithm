package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class InsertInSortedCircularLLTest {

    private InsertInSortedCircularLL obj = new InsertInSortedCircularLL();

    @Test
    public void test1() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createCircularSinglyFromArray(inputData);
        head1 = obj.insert(head1, 0);
        LinkedListUtils.printCSinglyLL(head1);

        Integer outputData[] = {0, 1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createCircularSinglyFromArray(inputData);
        Assert.assertTrue(LinkedListUtils.isEqualCircularSinglyLL(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createCircularSinglyFromArray(inputData);
        head1 = obj.insert(head1, 1);
        LinkedListUtils.printCSinglyLL(head1);
    }

    @Test
    public void test3() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createCircularSinglyFromArray(inputData);
        head1 = obj.insert(head1, 8);
        LinkedListUtils.printCSinglyLL(head1);
    }
}
