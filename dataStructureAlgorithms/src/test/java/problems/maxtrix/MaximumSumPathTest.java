package problems.maxtrix;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import problems.matrix.MaximumSumPath;

/**
 * @author harshit.mago
 */
public class MaximumSumPathTest {

    private MaximumSumPath obj = new MaximumSumPath();

    @Test
    public void test() {
        int arr[][] = {
                {10, 10, 2, 0, 20, 4},
                {1, 0, 0, 30, 2, 5},
                {0, 10, 4, 0, 2, 0},
                {1, 0, 2, 20, 0, 4}
        };

        Assert.assertEquals(74, obj.find(arr));
    }
}
