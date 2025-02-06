package Random;

import java.util.*;

public class Leetcode451_Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        String str = "tree";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        // Create a list to store the map entries
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list based on the values in descending order
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                // Sort in descending order of values
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Create a LinkedHashMap to maintain insertion order of sorted entries
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        StringBuilder string = new StringBuilder();

        // Print the sorted map
        System.out.println("Sorted HashMap by values in descending order:");
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            for(int i=1;i<=entry.getValue();i++){
                string.append(entry.getKey());
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(string.toString());

    }
}