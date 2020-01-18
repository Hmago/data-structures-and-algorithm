package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class RemoveDuplicateFromLinkedListTest {

    private RemoveDuplicateFromLinkedList obj = new RemoveDuplicateFromLinkedList();

    @Test
    public void test1_SortedList() {
        Integer inputData[] = {1, 1, 2, 2, 3, 3, 4, 4};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer expectedData[] = {1, 2, 3, 4};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        head1 = obj.removeDuplicateFromSortedLL(head1);
        LinkedListUtils.printSingly(head1);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2_SortedList() {
        Integer inputData[] = {1};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer expectedData[] = {1};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        head1 = obj.removeDuplicateFromSortedLL(head1);
        LinkedListUtils.printSingly(head1);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test3_UnsortedList() {
        Integer inputData[] = {1, 2, 1, 2, 5, 4};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer expectedData[] = {1, 2, 5, 4};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        head1 = obj.removeDuplicateFromUnsortedLL(head1);
        LinkedListUtils.printSingly(head1);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test4_UnsortedList() {
        Integer inputData[] = {1};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer expectedData[] = {1};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        head1 = obj.removeDuplicateFromUnsortedLL(head1);
        LinkedListUtils.printSingly(head1);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test5_UnsortedList() {
        Integer inputData[] = {1, 2, 1, 2, 5, 5, 5, 4, 4};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer expectedData[] = {1, 2, 5, 4};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        head1 = obj.removeDuplicateFromUnsortedLL(head1);
        LinkedListUtils.printSingly(head1);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
