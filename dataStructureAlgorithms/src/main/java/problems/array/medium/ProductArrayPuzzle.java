package problems.array.medium;

public class ProductArrayPuzzle {

    public int[] evaluate(int nums[]) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int output[] = new int[nums.length];

        if (nums.length < 2) {
            return nums;
        }

        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            output[i] = left[i] * right[i];
        }

        return output;
    }
}