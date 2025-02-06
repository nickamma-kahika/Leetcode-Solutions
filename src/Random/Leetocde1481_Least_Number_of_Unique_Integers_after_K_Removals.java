package Random;

import java.util.*;

public class Leetocde1481_Least_Number_of_Unique_Integers_after_K_Removals {
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        List<Integer> v = new ArrayList<>();
        int cnt = 0;
        for (int a : map.values()) {
            v.add(a);
        }
        Collections.sort(v);
        System.out.println(v);
        for (int i = 0; i < v.size(); i++) {
            if (k > v.get(i)) {
                k -= v.get(i);
                v.set(i, 0);
                System.out.println("if");
                System.out.println(k);
                System.out.println(v.get(i));
            } else {
                v.set(i, v.get(i) - k);
                k = 0;
                System.out.println("else");
                System.out.println(v.get(i));
            }
            if (v.get(i) != 0) cnt++;
        }

    }
}
