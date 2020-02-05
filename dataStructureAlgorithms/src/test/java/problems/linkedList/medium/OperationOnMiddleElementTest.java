package problems.linkedList.medium;

import org.junit.jupiter.api.Test;

public class OperationOnMiddleElementTest {

    private OperationOnMiddleElement<Integer> obj = new OperationOnMiddleElement<>();

    @Test
    public void test1(){
        for (int i=1;i<6;i++){
            obj.push(i);
        }

        System.out.println(obj.findMiddle());
        obj.deleteMiddle();
        System.out.println(obj.findMiddle());
    }

    @Test
    public void test2(){
        for (int i=1;i<6;i++){
            obj.push(i);
            System.out.println(obj.findMiddle());
        }

        for (int i=1;i<5;i++){
            obj.pop();
            System.out.println(obj.findMiddle());
        }
    }
}
