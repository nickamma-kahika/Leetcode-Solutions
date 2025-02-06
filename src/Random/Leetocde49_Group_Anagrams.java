package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetocde49_Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, ArrayList> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String key = sortString(strs[i]);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>(List.of(strs[i])));
            }
            // If key is already present, append the word to the existing list
            else {
                map.get(key).add(strs[i]);
            }
        }

        System.out.println(new ArrayList<>(map.values()));

    }

    public static String sortString(String str) {

        // Convert the string to an array of characters
        char[] charArray = str.toCharArray();

        // Sort the array of characters
        Arrays.sort(charArray);

        // Convert the sorted array back to a string
        return new String(charArray);
    }
}
