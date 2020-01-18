package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class PairwiseSwapTest {

    private PairwiseSwap obj = new PairwiseSwap();

    @Test
    public void test1() {
        Integer inputData[] = {1, 2, 3, 4, 5, 6};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.swap(head1);

        Integer expectedData[] = {2, 1, 4, 3, 6, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.swap(head1);

        Integer expectedData[] = {2, 1, 4, 3, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test3() {
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.swap(head1);

        Integer expectedData[] = {2, 1, 4, 3, 6, 5, 8, 7, 9};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
