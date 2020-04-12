package problems.array.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author harshit.mago
 */
public class BiggestNumberTest {
    private BiggestNumber obj = new BiggestNumber();

    @Test
    public void test(){
        List<String> input = new ArrayList<>();
        input.add("1");
        input.add("34");
        input.add("3");
        input.add("98");
        input.add("9");
        input.add("76");
        input.add("45");
        input.add("4");

        String output = obj.find(input);

        Assert.assertEquals("998764543431", output);


    }
}
