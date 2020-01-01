package problems.array.easy;

import org.junit.Assert;
import org.junit.Test;

public class RerrangeElementsInZigZagTest {

    private static RerrangeElementsInZigZag obj = new RerrangeElementsInZigZag();

    @Test
    public void test1(){
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        int expected[] = {3, 7, 4, 8, 2, 6, 1};

        Assert.assertArrayEquals(expected, obj.rearrange(arr));
    }

    @Test
    public void test2(){
        int arr[] = {1, 4, 3, 2};
        int expected[] = {1, 4, 2, 3};

        Assert.assertArrayEquals(expected, obj.rearrange(arr));
    }
}
