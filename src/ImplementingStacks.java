import java.util.Stack;

public class ImplementingStacks {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        
        System.out.println(st);
    }
}
