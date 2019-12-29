package algorithms.basic.sort;

import java.util.Arrays;

public class CountingSort {

    /*
     * Time Complexity:
     *      Best case: O(n+k)
     *      Avg Case: O(n+k)
     *      Worst Case: O(n+k)
     *
     * Space Complexity: O(n+k)
     *
     * Here n is the size of the input array and k is the max element in the array
     *
     * Limitation: Java supports positive indexes in array, so only positive numbers are supported
     */
    public int[] sort(int arr[]){
        int size = arr.length;
        int max_element = Integer.MIN_VALUE;
        for(int element: arr){
            if(element>max_element){
                max_element=element;
            }

            /* Check for -ve numbers*/
            if(element<0){
                return null;
            }
        }

        int output[] = new int[size];
        int temp[] = new int[max_element+1];
        for (int element: arr){
            temp[element]++;
        }

        for(int i=1;i<=max_element;i++){
            temp[i] = temp[i]+temp[i-1];
        }

        System.out.println("Temp="+Arrays.toString(temp));
        for(int element: arr){
            output[temp[element]-1] = element;
            temp[element]--;
        }
        System.out.println("Output="+Arrays.toString(output));
        return output;
    }
}
