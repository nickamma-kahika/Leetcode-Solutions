package BLIND_75;

import java.lang.reflect.AnnotatedType;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode152_Maximum_Product_Subarray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int prefix = 1;
        int maxx = Integer.MIN_VALUE;
        for(int el : arr){
            prefix *= el;
            maxx = Math.max(maxx, prefix);
            if(prefix == 0){
                prefix = 1;
            }
        }
        System.out.println(maxx);

    }
}
