package problems.dp;

import utils.ArrayUtils;

/**
 * @author harshit.mago
 */
public class PartitionProblem {

    public static boolean find(int arr[], int n){

        int sum = ArrayUtils.sum(arr);
        if(sum%2!=0){
            return false;
        }

        int findSum = sum/2;
        boolean mem[][] = new boolean[n+1][findSum+1];
        return SubsetSumProblem.find(arr, n-1, sum/2, mem);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 11, 5};
        System.out.println(find(arr, arr.length));
    }
}
