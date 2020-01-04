package problems.array.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MaximumSumPathInTwoArraysTest {

    private MaximumSumPathInTwoArrays obj = new MaximumSumPathInTwoArrays();

    @Test
    public void test1() {
        int ar1[] = {2, 3, 7, 10, 12};
        int ar2[] = {1, 5, 7, 8};

        Assert.assertEquals(35, obj.maxSum(ar1, ar2));
    }

    @Test
    public void test2() {
        int ar1[] = {10, 12};
        int ar2[] = {5, 7, 9};

        Assert.assertEquals(22, obj.maxSum(ar1, ar2));
    }

    @Test
    public void test3() {
        int ar1[] = {2, 3, 7, 10, 12, 15, 30, 34};
        int ar2[] = {1, 5, 7, 8, 10, 15, 16, 19};

        Assert.assertEquals(122, obj.maxSum(ar1, ar2));
    }
}
