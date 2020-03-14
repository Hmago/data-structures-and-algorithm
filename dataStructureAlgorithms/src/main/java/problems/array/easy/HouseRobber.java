package problems.array.easy;

/**
 * Find maximum possible stolen value from houses
 * Link: https://www.geeksforgeeks.org/find-maximum-possible-stolen-value-houses/
 */
public class HouseRobber {

    public int max(int nums[]) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        int max_value = 0;
        for (int i = 2; i < nums.length; i++) {
            max_value = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            dp[i] = max_value;
        }

        return max_value;
    }
}
