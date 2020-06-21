package problems.array.phase1.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {
    private ContainerWithMostWater obj = new ContainerWithMostWater();

    @Test
    public void test1(){
        int arr[] = {1, 5, 4, 3};
        Assert.assertEquals(6, obj.maxArea(arr));
    }

    @Test
    public void test2(){
        int arr[] = {3, 1, 2, 4, 5};
        Assert.assertEquals(12, obj.maxArea(arr));
    }
}
