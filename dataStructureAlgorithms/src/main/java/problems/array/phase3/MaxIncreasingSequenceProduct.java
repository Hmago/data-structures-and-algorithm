package problems.array.phase3;

import java.util.Arrays;

public class MaxIncreasingSequenceProduct {

    public static int maxProduct(int arr[]) {
        int LGR[] = new int[arr.length];
        int RGR[] = new int[arr.length];

        int max = arr[arr.length-1];
        RGR[arr.length-1] = 0;
        for(int i=arr.length-2;i>=0;i--){
            if(max<arr[i]){
                max = arr[i];
            }

            if(arr[i]<max){
                RGR[i] = max;
            }else{
                RGR[i] = 0;
            }
        }

        LGR[0] = 0;
        for(int i=1;i<arr.length;i++){
            LGR[i] = minInLeft(arr, i);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(RGR));
        System.out.println(Arrays.toString(LGR));

        int maxProduct = 0;
        for(int i=0;i< arr.length;i++){
            maxProduct = Math.max(maxProduct, arr[i]*LGR[i]*RGR[i]);
        }

        return maxProduct;
    }

    public static int minInLeft(int arr[], int pos){
        int max = 0;
        for(int i=0;i<pos;i++){
            if(arr[pos]>arr[i] && max<arr[i]){
                max=arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 1, 2, 3, 9, 10};
        System.out.println(maxProduct(arr));

    }
}
