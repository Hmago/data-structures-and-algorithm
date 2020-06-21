package problems.array.phase1.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EquilibriumIndexTest {

    private EquilibriumIndex obj = new EquilibriumIndex();

    @Test
    public void test1(){
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        Assert.assertEquals(obj.find(arr), 3);
    }
}
