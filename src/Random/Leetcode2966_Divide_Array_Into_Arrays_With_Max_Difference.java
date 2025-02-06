package Random;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode2966_Divide_Array_Into_Arrays_With_Max_Difference {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8,7,9,3,5,1};
        int k =2;
        int n = arr.length/3;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[][] ans = new int[n][3];

        int i=0;
        int j=2;
        int flag = 0;

        while(j<arr.length){
            if(arr[j] - arr[i] > k) {
                flag = 1;
                break;
            }
            i+=3;
            j+=3;
        }
        if(flag == 1){
            System.out.println("Not Possible");
        }else{
            for(int it=0; it < arr.length; i++){

            }
            System.out.println("Possible");
        }

    }
}
