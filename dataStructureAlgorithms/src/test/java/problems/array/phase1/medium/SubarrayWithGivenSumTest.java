package problems.array.phase1.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SubarrayWithGivenSumTest {
    private SubarrayWithGivenSum obj = new SubarrayWithGivenSum();

    @Test
    public void test1(){
        int arr[] = {1, 4, 20, 3, 10, 5};
        int output[] = {2, 4};
        Assert.assertArrayEquals(output, obj.find(arr, 33));
    }

    @Test
    public void test2(){
        int arr[] = {1, 4, 0, 0, 3, 10, 5};
        int output[] = {1, 4};
        Assert.assertArrayEquals(output, obj.find(arr, 7));
    }

    @Test
    public void test3(){
        int arr[] = {1, 4};
        int output[] = {-1, -1};
        Assert.assertArrayEquals(output, obj.find(arr, 0));
    }
}
