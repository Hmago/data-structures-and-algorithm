package problems.linkedList.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LinkedListWithMiddleElementTest {

    private LinkedListWithMiddleElement obj = new LinkedListWithMiddleElement();

    @Test
    public void test1() {
        obj.push(1);
        obj.push(2);
        obj.push(3);

        Assert.assertEquals(2, obj.getMiddle());

    }

    @Test
    public void test2() {
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.pop();
        obj.pop();
        Assert.assertEquals(2, obj.getMiddle());

    }
}
