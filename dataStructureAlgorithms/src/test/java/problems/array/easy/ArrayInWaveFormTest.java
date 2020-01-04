package problems.array.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayInWaveFormTest {

    private ArrayInWaveForm obj = new ArrayInWaveForm();

    @Test
    public void test1() {
        int input[] = {10, 5, 6, 3, 2, 20, 100, 80};
        int output[] = {10, 5, 6, 2, 20, 3, 100, 80};
        Assert.assertArrayEquals(output, obj.transform(input));
    }

    @Test
    public void test2() {
        int input[] = {20, 10, 8, 6, 4, 2};
        int output[] = {20, 8, 10, 4, 6, 2};
        Assert.assertArrayEquals(output, obj.transform(input));
    }

    @Test
    public void test3() {
        int input[] = {2, 4, 6, 8, 10, 20};
        int output[] = {4, 2, 8, 6, 20, 10};
        Assert.assertArrayEquals(output, obj.transform(input));
    }

    @Test
    public void test4() {
        int input[] = {3, 6, 5, 10, 7, 20};
        int output[] = {6, 3, 10, 5, 20, 7};
        Assert.assertArrayEquals(output, obj.transform(input));
    }
}
