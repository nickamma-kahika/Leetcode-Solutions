package Random;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_238_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,0};
        int zerocount = 0;
        int prod = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                prod*=arr[i];
            }else if(arr[i]==0){
                zerocount++;
            }
        }

        if(zerocount>1){
            System.out.println(new int[arr.length]);
        }else if(zerocount == 1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[i] = 0;
                }else if(arr[i]==0){
                    arr[i] = prod;
                }
            }
        }else if(zerocount == 0){
            for(int i=0;i<arr.length;i++){
                arr[i] = prod/arr[i];
            }
        }


    }
}
