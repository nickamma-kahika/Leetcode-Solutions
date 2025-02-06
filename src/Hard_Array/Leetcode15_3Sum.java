package Hard_Array;

//  https://leetcode.com/problems/3sum/description/

import java.util.*;

public class Leetcode15_3Sum {
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);

        List<List<Integer>> list  = new ArrayList<>();
//        List<Integer> subList = new ArrayList<>();
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
//                    subList.clear();
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
//                        subList.add(arr[i]);
//                        subList.add(arr[j]);
//                        subList.add(arr[k]);
                        if(list.contains(temp) == false){
                            list.add(new ArrayList<>(temp));
                        }

                    }
                }
            }
        }

        System.out.println(list);

    }
}
