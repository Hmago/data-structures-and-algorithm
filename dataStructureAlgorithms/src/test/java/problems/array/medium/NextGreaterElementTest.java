package problems.array.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NextGreaterElementTest {

    private NextGreaterElement obj = new NextGreaterElement();

    @Test
    public void test1() {
        int arr[] = {4, 5, 2, 25};
        Assert.assertArrayEquals(new int[]{5, 25, 25, -1}, obj.find(arr));
    }

    @Test
    public void test2() {
        int arr[] = {13, 7, 6, 12};
        Assert.assertArrayEquals(new int[]{-1, 12, 12, -1}, obj.find(arr));
    }

    @Test
    public void test3() {
        int arr[] = {11, 13, 21, 3};
        Assert.assertArrayEquals(new int[]{13, 21, -1, -1}, obj.find(arr));
    }
}
