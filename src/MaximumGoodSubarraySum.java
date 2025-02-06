import java.util.ArrayList;

public class MaximumGoodSubarraySum {
    public static void main(String[] args) {

        int[] arr = {-1,-2,-3,-4};
        int k = 2;
        int maxAns = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            int max = 0;
            max += arr[i];
            for(int j = i+1; j<arr.length; j++){
                max += arr[j];
                if(Math.abs(arr[j] - arr[i]) == k){
                    maxAns = Math.max(max, maxAns);
                    count ++;
                }
            }
        }


        System.out.println(maxAns);
    }
}
