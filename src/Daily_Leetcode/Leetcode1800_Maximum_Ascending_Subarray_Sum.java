package Daily_Leetcode;

public class Leetcode1800_Maximum_Ascending_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,5,10,50};
        int sum = arr[0];
        int max = sum;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                sum += arr[i];
                max = Math.max(max, sum);
            }else if(arr[i] < arr[i-1]){
                sum = arr[i];
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
    }
}
