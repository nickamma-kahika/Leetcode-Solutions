package Random;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Leetcode31_Next_Permutation {
    public static void main(String[] args) {
        int[] arr = {5,4,3,0,0};
        int index = -1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
           if(arr[i] < arr[i+1]){
               index = i;
               break;
           }
        }
        System.out.println(index);

        if(index == -1){
            int start = 0;
            int end = arr.length-1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        else{
            int start = index+1;
            int end = arr.length-1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(arr));
            for(int i= index+1;i<arr.length;i++){
                if(arr[i] > arr[index]){
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
