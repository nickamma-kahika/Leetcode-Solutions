package Hard_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode56_Merge_Intervals {
    public static void main(String[] args) {
        int[][] arr = {{0,4},{0,0}};
//        List<Integer> sublist = new ArrayList<>();
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(arr));
    }
}
