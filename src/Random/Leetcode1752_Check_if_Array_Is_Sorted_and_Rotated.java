package Random;

public class Leetcode1752_Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int brPoint = -1;
        boolean ans = true;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                brPoint = i;
            }
        }
        if(brPoint == -1){
            System.out.println(true);
        }else{
            if(arr[arr.length-1] > arr[0]){
                System.out.println(false);
            }else {

            }
        }
        System.out.println(ans);
    }
}
