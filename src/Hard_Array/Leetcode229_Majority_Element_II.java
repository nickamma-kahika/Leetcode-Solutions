package Hard_Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode229_Majority_Element_II {
    public static void main(String[] args) {

        // https://leetcode.com/problems/majority-element-ii/description/

        int[] arr = {2,2};
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if( map.get(arr[i]) == arr.length/3+1){
                list.add(arr[i]);
            }
        }
        System.out.println(arr.length);
        System.out.println(list);

    }
}
