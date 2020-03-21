package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class NthNodeFromLastTest {
    private NthNodeFromLast obj = new NthNodeFromLast();

    @Test
    public void test1(){
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Assert.assertEquals(4, obj.find(head1, 2));
    }
}
