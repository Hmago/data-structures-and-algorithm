package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class InsertInSortedLLTest {

    private InsertInSortedLL obj = new InsertInSortedLL();

    @Test
    public void test1() {
        SinglyLinkedList<Integer> head1 = obj.insert(null, 1);

        Integer expectedData[] = {1};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.insert(head1, 6);

        Integer expectedData[] = {1, 2, 3, 4, 5, 6};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test3() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.insert(head1, 1);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {1, 1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test4() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.insert(head1, 0);

        Integer expectedData[] = {0, 1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
