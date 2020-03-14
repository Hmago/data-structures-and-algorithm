package problems.array.easy;

import algorithms.basic.sort.QuickSort;

/**
 * Find a triplet that sum to a given value
 * link: https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
 */
public class Find3Numbers {
    public boolean doesExist(int arr[], int sum){
        if(arr.length<3){
            return false;
        }

        QuickSort quickSort = new QuickSort();
        arr = quickSort.sort(arr);
        for(int i=0;i<arr.length;i++){
            int tempSum=0, j=i+1, k=arr.length-1;
            while (j < k) {
                tempSum = arr[i]+arr[j]+arr[k];
                if(tempSum==sum){
                    return true;
                }

                if(tempSum<sum){
                    j++;
                }else{
                    k--;
                }
            }
        }


        return false;
    }
}
