package GeeksForGeeks;

import java.util.*;

public class Largest_subarray_with_0_sum {
    static int maxLen(int A[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0;

        for(int i = 0;i<n;i++) {

            sum += A[i];

            if(sum == 0) {
                maxi = i + 1;
            }
            else {
                if(mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum));
                }
                else {

                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> sublist = new ArrayList<>();
//        int target = 0;
//        int sum = 0;
//        int len = 0;
//        int maxlen = 0;

        int maxlen = maxLen(arr, arr.length);



//        for (int i = 0; i < arr.length; i++) {
//            len = 0;
//            sum = 0;
//            sublist.clear();
//            for (int j = i; j < arr.length; j++) {
//                len++;
//                sublist.add(arr[j]);
//                sum += arr[j];
//                if(sum == 0){
//                    if(len > maxlen)
//                        maxlen = len;
//                    list.add(new ArrayList<>(sublist));
//                }
//            }
//        }
//        System.out.println(list);
        System.out.println(maxlen);
    }
}





