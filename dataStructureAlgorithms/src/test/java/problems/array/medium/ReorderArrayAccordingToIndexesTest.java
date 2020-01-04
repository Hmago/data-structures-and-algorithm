package problems.array.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ReorderArrayAccordingToIndexesTest {
    private ReorderArrayAccordingToIndexes obj = new ReorderArrayAccordingToIndexes();

    @Test
    public void test1() {
        int arr[] = {10, 11, 12};
        int indexes[] = {1, 0, 2};

        obj.rearrange(arr, indexes);

        Assert.assertArrayEquals(arr, new int[]{11, 10, 12});
        Assert.assertArrayEquals(indexes, new int[]{0, 1, 2});
    }

    @Test
    public void test2() {
        int arr[] = {50, 40, 70, 60, 90};
        int indexes[] = {3, 0, 4, 1, 2};

        obj.rearrange(arr, indexes);
        Assert.assertArrayEquals(arr, new int[]{40, 60, 90, 50, 70});
        Assert.assertArrayEquals(indexes, new int[]{0, 1, 2, 3, 4});
    }

}
