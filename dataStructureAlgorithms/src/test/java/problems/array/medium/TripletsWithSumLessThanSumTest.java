package problems.array.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TripletsWithSumLessThanSumTest {

    private TripletsWithSumLessThanSum obj = new TripletsWithSumLessThanSum();

    @Test
    public void test1() {
        int sum = 2;
        int arr[] = {-2, 0, 1, 3};

        Assert.assertEquals(2, obj.count(arr, sum));
    }

    @Test
    public void test2() {
        int sum = 12;
        int arr[] = {5, 1, 3, 4, 7};

        Assert.assertEquals(4, obj.count(arr, sum));
    }

    @Test
    public void test3() {
        int sum = 122;
        int arr[] = {5, 1, 3, 4, 7};

        Assert.assertEquals(10, obj.count(arr, sum));
    }
}
