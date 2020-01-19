package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class MergeTwoLLAlternateTest {

    private MergeTwoLLAlternate obj = new MergeTwoLLAlternate();

    @Test
    public void test1() {
        Integer input1[] = {1, 3, 5, 7, 9};
        Integer input2[] = {2, 4, 6, 8, 10};

        SinglyLinkedList<Integer> head = obj.merge(LinkedListUtils.createSinglyFromArray(input1), LinkedListUtils.createSinglyFromArray(input2));

        Integer output[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SinglyLinkedList<Integer> outputhead = LinkedListUtils.createSinglyFromArray(output);

        LinkedListUtils.printSingly(head);
        Assert.assertTrue(LinkedListUtils.isEqual(head, outputhead));
    }

    @Test
    public void test2() {
        Integer input1[] = {1, 3, 5, 7, 9};
        Integer input2[] = {2, 4};

        SinglyLinkedList<Integer> head = obj.merge(LinkedListUtils.createSinglyFromArray(input1), LinkedListUtils.createSinglyFromArray(input2));

        Integer output[] = {1, 2, 3, 4, 5, 7, 9};
        SinglyLinkedList<Integer> outputhead = LinkedListUtils.createSinglyFromArray(output);

        LinkedListUtils.printSingly(head);
        Assert.assertTrue(LinkedListUtils.isEqual(head, outputhead));
    }

    @Test
    public void test3() {
        Integer input1[] = {1, 3};
        Integer input2[] = {2, 4, 6, 8, 10};

        SinglyLinkedList<Integer> head = obj.merge(LinkedListUtils.createSinglyFromArray(input1), LinkedListUtils.createSinglyFromArray(input2));

        Integer output[] = {1, 2, 3, 4, 6, 8, 10};
        SinglyLinkedList<Integer> outputhead = LinkedListUtils.createSinglyFromArray(output);

        LinkedListUtils.printSingly(head);
        Assert.assertTrue(LinkedListUtils.isEqual(head, outputhead));
    }

}
