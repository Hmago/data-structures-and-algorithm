package algorithms.basic.sort;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class MergeSortLLTest {

    private MergeSortLL obj = new MergeSortLL();

    @Test
    public void test1() {
        Integer inputData[] = {1, 4, 3, 2, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.sort(head1);
        LinkedListUtils.printSingly(head1);

        Integer outputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(outputData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData[] = {1, 4, 3, 2, 5, 7, 6};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.sort(head1);
        LinkedListUtils.printSingly(head1);

        Integer outputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(outputData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
