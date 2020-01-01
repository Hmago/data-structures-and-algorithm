package problems.array.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersRepresentedByArraysTest {

    private static AddTwoNumbersRepresentedByArrays mainClass = new AddTwoNumbersRepresentedByArrays();

    @Test
    public void test1() {
        int arr1[] = {1};
        int arr2[] = {1};

        Assert.assertEquals(2, mainClass.sum(arr1, arr2));
    }

    @Test
    public void test2() {
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 1, 4};

        Assert.assertEquals(337, mainClass.sum(arr1, arr2));
    }

    @Test
    public void test3() {
        int arr1[] = {9, 5, 4, 9};
        int arr2[] = {2, 1, 4};

        Assert.assertEquals(9763, mainClass.sum(arr1, arr2));
    }

    @Test
    public void test4() {
        int arr1[] = {9, 3, 9};
        int arr2[] = {6, 1};

        Assert.assertEquals(1000, mainClass.sum(arr1, arr2));
    }
}

