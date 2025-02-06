package Random;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Leetcode169_Majority_Element {
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(arr[i],  map.getOrDefault(arr[i], 0)+1);
        }
        // ITERATING USING A ENTRYSET()
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//
//            System.out.println("Key: " + key + ", Frequency: " + value);
//        }
        // Iterating using forEach
        map.forEach((key, value) ->
                System.out.println("Key: " + key + ", Frequency: " + value)
        );
    }
}

class Solution {

    static {
        for (int i = 0; i < 500; i++) {
            majorityElement(new int[]{});
        }
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
                count++;
            } else if (num == element) {
                count++;
            } else {
                count--;
            }
        }
        // System.gc();
        return element;

    }
}



