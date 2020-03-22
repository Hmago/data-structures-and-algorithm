package problems.linkedList.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FirstNonRepeatingCharinStreamTest {

    private FirstNonRepeatingCharinStream obj = new FirstNonRepeatingCharinStream();

    @Test
    public void test1() {
        obj.add('g');
        obj.add('o');

        Character result = 'g';
        if (!result.equals(obj.getFirstNonRepeating())) {
            Assert.assertTrue(false);
        }
        obj.add('o');
        obj.add('g');
        result = 'g';
        if (obj.getFirstNonRepeating() != null) {
            Assert.assertTrue(false);
        }

        obj.add('l');
        obj.add('e');
        result = 'l';
        if (!result.equals(obj.getFirstNonRepeating())) {
            Assert.assertTrue(false);
        }
    }
}
