package Random;

import java.util.Arrays;

public class Leetcode2149_Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {
        int[] arr= {3,1,-2,-5,2,-4};
        int j=0;
        int k=1;
        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[j] = arr[i];
                System.out.println(ans[j]+" -> "+arr[i]+" -> "+j+" -> "+i);
                j+=2;
            }else{
                ans[k] = arr[i];
                System.out.println(ans[k]+" -> "+arr[i]+" -> "+k);
                k+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
