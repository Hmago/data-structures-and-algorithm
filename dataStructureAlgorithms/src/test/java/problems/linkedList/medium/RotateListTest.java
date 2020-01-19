package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class RotateListTest {

    private RotateList obj = new RotateList();

    @Test
    public void test1() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.rotate(head1, 2);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {4, 5, 1, 2, 3};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.rotate(head1, 1);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {7, 1, 2, 3, 4, 5, 6};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test3() {
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.rotate(head1, 0);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test4() {
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.rotate(head1, 8);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {7, 1, 2, 3, 4, 5, 6};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
