package problems.array.phase1.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FindSubArrayWithGivenSumTest {

    private FindSubArrayWithGivenSum obj = new FindSubArrayWithGivenSum();

    @Test
    public void test1(){
        int arr[] = {1, 4, 20, 3, 10, 5};

        int result[] = {2, 4};

        Assert.assertArrayEquals(obj.find(arr, 33), result);
    }

    @Test
    public void test2(){
        int arr[] = {23, 2, 4, 6, 7};
        Assert.assertTrue(obj.checkSubarraySum(arr, 6));
    }

    @Test
    public void test3(){
        int arr[] = {23, 2, 6, 4, 7};
        Assert.assertTrue(obj.checkSubarraySum(arr, 6));
    }
}
