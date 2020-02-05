package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class MultiplyTwoNumbersTest {
    private MultiplyTwoNumbers obj = new MultiplyTwoNumbers();

    @Test
    public void test1() {
        Integer inputData1[] = {9, 4, 6};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData1);

        Integer inputData2[] = {8, 4};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(inputData2);

        Assert.assertEquals(79464, obj.multiply(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData1[] = {3, 2, 1};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData1);

        Integer inputData2[] = {1, 2};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(inputData2);

        Assert.assertEquals(3852, obj.multiply(head1, head2));
    }
}
