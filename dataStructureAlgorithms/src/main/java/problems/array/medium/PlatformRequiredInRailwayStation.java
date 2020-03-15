package problems.array.medium;

import algorithms.basic.sort.QuickSort;

/**
 * Minimum Number of Platforms Required for a Railway/Bus Station
 * Link: https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
 */
public class PlatformRequiredInRailwayStation {

    public int platforms(int arr[], int dept[]) {
        QuickSort qs = new QuickSort();

        qs.sort(arr);
        qs.sort(dept);

        int platformRequired = 1, i = 1, j = 0, result = 0;
        while (i < arr.length && j < dept.length) {
            if (arr[i] <= dept[j]) {
                platformRequired++;
                i++;

                if (result < platformRequired) {
                    result = platformRequired;
                }
            } else {
                platformRequired--;
                j++;
            }
        }

        return result;
    }
}
