package utils;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author harshit.mago
 */
public class ArrayUtilsTest {

    @Test
    public void testReverse1() {
        int arr[] = {1, 2, 3, 4, 5};
        int expected[] = {2, 1, 5, 4, 3};

        ArrayUtils.reverse(arr, 0, 1);
        ArrayUtils.reverse(arr, 2, arr.length - 1);

        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    public void testReverse2() {
        int arr[] = {1, 2, 3, 4, 5};
        int expected[] = {5, 4, 3, 2, 1};

        Assert.assertArrayEquals(expected, ArrayUtils.reverse(arr, 0, arr.length-1));
    }
}
