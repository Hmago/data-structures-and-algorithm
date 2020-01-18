package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class FindMiddleInLLTest {
    private FindMiddleInLL obj = new FindMiddleInLL();

    @Test
    public void test1() {
        Integer data[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head = LinkedListUtils.createSinglyFromArray(data);

        int middle = obj.find(head);
        Assert.assertEquals(middle, 3);
    }

    @Test
    public void test2() {
        Integer data[] = {1, 2, 3, 4, 5, 6};
        SinglyLinkedList<Integer> head = LinkedListUtils.createSinglyFromArray(data);

        int middle = obj.find(head);
        Assert.assertEquals(middle, 3);
    }

    @Test
    public void test3() {
        Integer data[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head = LinkedListUtils.createSinglyFromArray(data);

        int middle = obj.find(head);
        Assert.assertEquals(middle, 4);
    }
}
