package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class ReverseLinkedListTest {

    private ReverseLinkedList obj = new ReverseLinkedList();

    @Test
    public void test1() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.reverse(head1);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {5, 4, 3, 2, 1};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.reverse(head1, 3);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {3, 2, 1, 4, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test3() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.reverse(head1, 1);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test4() {
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.reverse(head1, 1, 6);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {1, 7, 6, 5, 4, 3, 2};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

}
