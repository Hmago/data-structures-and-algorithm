package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class FindSumInThreeSortedListTest {

    private FindSumInThreeSortedList obj = new FindSumInThreeSortedList();

    @Test
    public void test1(){
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer inputData2[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(inputData2);

        Integer inputData3[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head3 = LinkedListUtils.createSinglyFromArray(inputData3);

        Assert.assertTrue(obj.doesExist(6, head1, head2, head3));
    }

    @Test
    public void test2(){
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer inputData2[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(inputData2);

        Integer inputData3[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head3 = LinkedListUtils.createSinglyFromArray(inputData3);

        Assert.assertFalse(obj.doesExist(6000, head1, head2, head3));
    }

    @Test
    public void test3(){
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer inputData2[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(inputData2);

        Integer inputData3[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head3 = LinkedListUtils.createSinglyFromArray(inputData3);

        Assert.assertTrue(obj.doesExist(20, head1, head2, head3));
    }
}
