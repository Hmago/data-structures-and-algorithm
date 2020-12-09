package problems.array.phase3;

public class MaximumSumIncreasingSubsequence {

    public static int maxSum(int arr[], int sum, int lastElem, int i) {
        if (arr.length <= i) {
            return sum;
        }

        int updatedSum = sum, updatedLastElem = lastElem;
        if (lastElem < arr[i]) {
            updatedLastElem = Math.max(lastElem, arr[i]);
            updatedSum = sum + arr[i];
        }


        return Math.max(maxSum(arr, updatedSum, updatedLastElem, i + 1), maxSum(arr, sum, lastElem, i + 1));
    }

    public static int maxSumMemory(int arr[]) {
        int max = Integer.MIN_VALUE;

        int mem[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mem[i] = arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && mem[i] < mem[j] + arr[i]) {
                    mem[i] = mem[j] + arr[i];
                }
            }
        }

        for (int val : mem) {
            if (max < val) {
                max = val;
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int arr[] = {1, 101, 2, 3, 100, 4, 5};
//        System.out.println("===MAx Sum ==" + maxSum(arr, 0, Integer.MIN_VALUE, 0));
        System.out.println("===MAx Sum ==" + maxSumMemory(arr));

        int arr2[] = {10, 5, 4, 3};
//        System.out.println("===MAx Sum ==" + maxSum(arr2, 0, Integer.MIN_VALUE, 0));
        System.out.println("===MAx Sum ==" + maxSumMemory(arr2));
    }
}
