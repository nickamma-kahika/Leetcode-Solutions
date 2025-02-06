package Random;

public class Leetcode3151_Special_Array_I {
    public static void main(String[] args) {
        int[] arr = {4,3,0,1,6};
        boolean ans = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]%2 == 0 && arr[i+1]%2!=0){
                ans = true;
            }else if (arr[i]%2!=0 && arr[i+1]%2==0){
                ans = true;
            }else{
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
