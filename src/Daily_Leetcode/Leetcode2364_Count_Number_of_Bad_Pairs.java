package Daily_Leetcode;

import java.util.HashMap;

public class Leetcode2364_Count_Number_of_Bad_Pairs {
    public static void main(String[] args) {
        int[] arr = {4,1,3,3};
        int n = arr.length;
        long badPairs = 0;
        HashMap<Integer, Integer> diffCount = new HashMap<>();

        for (int pos = 0; pos < arr.length; pos++) {
            int diff = pos - arr[pos];

            int goodPairsCount = diffCount.getOrDefault(diff, 0);

            badPairs += pos - goodPairsCount;

            diffCount.put(diff, goodPairsCount + 1);
        }

        System.out.println(badPairs);

    }
}
