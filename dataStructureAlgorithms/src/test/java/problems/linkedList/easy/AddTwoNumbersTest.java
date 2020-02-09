package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class AddTwoNumbersTest {

    private AddTwoNumbers obj = new AddTwoNumbers();

    @Test
    public void test1(){
        Integer inputData[] = {5, 6, 3};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Integer outputData[] = {8, 4, 2};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(outputData);
        int sum = obj.add(head1, head2);

        Assert.assertEquals(sum, 613);
    }
}
