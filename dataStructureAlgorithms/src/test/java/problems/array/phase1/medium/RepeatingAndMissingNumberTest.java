package problems.array.phase1.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RepeatingAndMissingNumberTest {

    private RepeatingAndMissingNumber obj = new RepeatingAndMissingNumber();

    @Test
    public void test1(){
        int arr[] = {3, 1, 3};
        Assert.assertArrayEquals(new int[]{3, 2}, obj.find(arr));
    }

    @Test
    public void test2(){
        int arr[] = {4, 3, 6, 2, 1, 1};
        Assert.assertArrayEquals(new int[]{1, 5}, obj.find(arr));
    }

    @Test
    public void test3(){
        int arr[] = {4, 4, 6, 2, 1, 3};
        Assert.assertArrayEquals(new int[]{4, 5}, obj.find(arr));
    }
}
