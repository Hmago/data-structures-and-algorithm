package problems.array.phase3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public static List<List<Integer>> getSublist(int[] arr) {
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        output.add(list1);
        for (int i : arr) {
            List<List<Integer>> tempList = new ArrayList<>();
            for (List<Integer> innerList : output) {
                ArrayList<Integer> temp = new ArrayList<>(innerList);
                temp.add(i);
                tempList.add(temp);
            }

            output.addAll(tempList);
        }

        return output;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> output = getSublist(arr);
        output.stream().forEach(k-> System.out.println(Arrays.toString(k.toArray())));
    }
}
