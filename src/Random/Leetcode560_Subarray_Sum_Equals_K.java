package Random;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode560_Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int K = 3;
        int count = 0;
        int sum = arr[0];

        //Optimal approach
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            count += map.getOrDefault(preSum-K, 0 );
            map.put(preSum, map.getOrDefault(preSum, 0)+1 );
        }



        // complexity is N^2
//        for (int i=0;i<arr.length;i++){
//            sum = arr[i];
//            if(sum == K){
//                count++;
//            }
//            for (int j = i+1; j < arr.length; j++) {
//                sum += arr[j];
//                if(sum == K){
//                    count++;
//                }
//            }
//        }
        System.out.println(count);
    }
}
