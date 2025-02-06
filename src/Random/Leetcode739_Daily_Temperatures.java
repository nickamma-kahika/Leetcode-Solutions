package Random;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode739_Daily_Temperatures {
    public static void main(String[] args) {

        int[] arr = {73,74,75,71,69,72,76,73};
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            if(stack.empty()){
                stack.push(i);
                ans[i] = 0;
            }
            else{
                while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                    stack.pop();

                }
                if (stack.isEmpty()) {
                    ans[i] = 0;
                } else {
                    ans[i] = stack.peek() - i;
                }

                stack.push(i);
            }

        }

        System.out.println(Arrays.toString(ans));
    }
}
