package problems.array.phase1.easy;

/**
 * Equilibrium index of an array
 * Link: https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 */
public class EquilibriumIndex {

    public int find(int nums[]) {
        if (nums.length<1){
            return -1;
        }
        int sum = 0, left =0, right;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            right = sum - nums[i] - left;
            if (right == left) {
                return i;
            }
            left = left + nums[i];
        }

        return -1;
    }
}
