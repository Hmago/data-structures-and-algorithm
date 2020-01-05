package problems.array.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MinimumLengthUnsortedArrayTest {
    private MinimumLengthUnsortedArray obj = new MinimumLengthUnsortedArray();

    @Test
    public void test1() {
        int arr[] = {2, 6, 4, 8, 10, 9, 15};
        Assert.assertEquals(5, obj.findLength(arr));
    }

    @Test
    public void test2() {
        int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        Assert.assertEquals(6, obj.findLength(arr));
    }

    @Test
    public void test3() {
        int arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        Assert.assertEquals(4, obj.findLength(arr));
    }
}
