package problems.array.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RearrangeInMinMaxFormTest {

    private RearrangeInMinMaxForm obj = new RearrangeInMinMaxForm();

    @Test
    public void test1() {
        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int output[] = {7, 1, 6, 2, 5, 3, 4};
        Assert.assertArrayEquals(output, obj.rearrange(input));
    }

    @Test
    public void test2() {
        int input[] = {1, 2, 3, 4, 5, 6};
        int output[] = {6, 1, 5, 2, 4, 3};
        Assert.assertArrayEquals(output, obj.rearrange(input));
    }
}
