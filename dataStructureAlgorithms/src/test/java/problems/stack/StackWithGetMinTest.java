package problems.stack;

import org.junit.jupiter.api.Test;

public class StackWithGetMinTest {

    @Test
    public void test1(){
        StackWithGetMin obj = new StackWithGetMin(10);
        System.out.println("Pushing 20 "+obj.push(20)+", min value="+obj.getMin());
        System.out.println("Pushing 18 "+obj.push(18)+", min value="+obj.getMin());
        System.out.println("Pushing 19 "+obj.push(19)+", min value="+obj.getMin());
        System.out.println("Pushing 14 "+obj.push(14)+", min value="+obj.getMin());

        System.out.println("POP "+obj.pop()+", min value="+obj.getMin());
        System.out.println("POP "+obj.pop()+", min value="+obj.getMin());
        System.out.println("POP "+obj.pop()+", min value="+obj.getMin());
    }
}
