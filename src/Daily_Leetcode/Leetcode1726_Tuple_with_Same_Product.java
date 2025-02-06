package Daily_Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1726_Tuple_with_Same_Product {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,10};
        int prod = 1;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            prod = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                prod *= arr[j];
                map.put(prod, map.getOrDefault(prod, 0)+1);
                prod /= arr[j];
            }
        }

//        System.out.println(map);
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getValue() > 1){
                int n = mp.getValue();
                int countMethod = (n*(n-1))/2;
                ans += countMethod*8;
            }
        }
        System.out.println(ans);

    }
}
