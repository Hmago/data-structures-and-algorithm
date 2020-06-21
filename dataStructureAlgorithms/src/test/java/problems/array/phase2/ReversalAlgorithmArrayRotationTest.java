package problems.array.phase2;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author harshit.mago
 */
public class ReversalAlgorithmArrayRotationTest {

    private ReversalAlgorithmArrayRotation obj = new ReversalAlgorithmArrayRotation();

    @Test
    public void test1(){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int expected[] = {3, 4, 5, 6, 7, 1, 2};

        Assert.assertArrayEquals(expected, obj.rotate(arr, 2));
    }

    @Test
    public void test2(){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int expected[] = {4, 5, 6, 7, 1, 2, 3};

        Assert.assertArrayEquals(expected, obj.rotate(arr, 3));
    }

    @Test
    public void test3(){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int expected[] = {4, 5, 6, 7, 1, 2, 3};

        Assert.assertArrayEquals(expected, obj.rotate(arr, 10));
    }
}
