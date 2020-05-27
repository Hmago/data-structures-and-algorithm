package problems.dp;

/**
 * @author harshit.mago
 */
public class CountOfSubsetSum {

    public static int count(int arr[], int sum, int n, int count, int mem[][]) {
        if (n < 0 && sum != 0) {
            return count;
        } else if (sum == 0) {
            return count + 1;
        }

        if(mem[n][sum]>0){
            return mem[n][sum];
        }
        if (arr[n] <= sum) {
            mem[n][sum] =  count(arr, sum - arr[n], n - 1, count, mem) + count(arr, sum, n - 1, count, mem);
        } else {
            mem[n][sum] =  count(arr, sum, n - 1, count, mem);
        }

        return mem[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {3, 3, 3, 3};
        int x=6;

        int mem[][] = new int[arr.length+1][x+1];
        System.out.println(count(arr, x, arr.length-1, 0, mem));
    }
}
