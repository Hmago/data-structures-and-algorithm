package problems.array.phase1.medium;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author harshit.mago
 * <p>
 * https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
 * Time Complexity: O(nlogn)
 */
public class BiggestNumber {
    public String find(List<String> arr) {

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String xy = o1 + o2;
                String yx = o2 + o1;
                return xy.compareTo(yx) > 0 ? -1 : 1;
            }
        });

        String result = "";
        for (String t : arr) {
            result = result.concat(t);
        }

        return result;
    }
}
