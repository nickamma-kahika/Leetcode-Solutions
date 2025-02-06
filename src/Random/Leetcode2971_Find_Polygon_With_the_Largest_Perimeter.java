package Random;

import java.util.Arrays;

public class Leetcode2971_Find_Polygon_With_the_Largest_Perimeter {
    public static void main(String[] args) {
        int[] arr = {1,12,1,2,5,50,3};

        Arrays.sort(arr);
        int sum = 0;

        for(int i=0;i<arr.length;i++) sum+=arr[i];
        System.out.println(sum);

        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=3;i--){
            sum -= arr[i];
            System.out.println(sum);
            if(sum>=arr[i]){
                max = Math.max(max, sum);
                System.out.println("max -> "+max);
            }
        }

        System.out.println(max);
    }
}
