package problems.array.phase3;

public class CircularKadane {

    public static int maxSubArraySum(int arr[]) {
        int kadane = kadane(arr);
        int max_wrap = 0;
        for (int i = 0; i < arr.length; i++) {
            max_wrap += arr[i];
            arr[i] *= -1;
        }

        max_wrap = max_wrap + kadane(arr);
        return Math.max(max_wrap, kadane);
    }


    public static int kadane(int arr[]) {
        int maxSum = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (maxSum < sum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {11, 10, -20, 5, -3, -5, 8, -13, 10};

        System.out.println(maxSubArraySum(arr));
    }
}
