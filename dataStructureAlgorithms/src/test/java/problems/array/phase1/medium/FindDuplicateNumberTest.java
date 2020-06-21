package problems.array.phase1.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FindDuplicateNumberTest {
    private FindDuplicateNumber obj = new FindDuplicateNumber();

    @Test
    public void test1() {
        int arr[] = {1, 3, 4, 2, 2};
        Assert.assertEquals(2, obj.find(arr));
    }

    @Test
    public void test2() {
        int arr[] = {3, 1, 3, 4, 2};
        Assert.assertEquals(3, obj.find(arr));
    }
}
