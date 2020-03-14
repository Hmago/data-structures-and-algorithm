package problems.array.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Sort012Test {

    private Sort012 obj = new Sort012();

    @Test
    public void test1() {
        int arr[] = {0, 1, 2, 0, 1, 2};
        int result[] = {0, 0, 1, 1, 2, 2};

        obj.sort(arr);
        Assert.assertArrayEquals(result, arr);
    }

    @Test
    public void test2() {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int result[] = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};

        obj.sort(arr);
        Assert.assertArrayEquals(result, arr);
    }
}
