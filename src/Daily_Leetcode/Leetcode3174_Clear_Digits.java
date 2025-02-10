package Daily_Leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class Leetcode3174_Clear_Digits {
    public static void main(String[] args) {
        String str = "b9fh";
        StringBuilder resstr = new StringBuilder();
        Stack<Character> st = new Stack<>();
        ArrayList<Character> arr = new ArrayList<>();
        int count = 0;
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
            arr.add(ch);
            ch++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(arr.contains(str.charAt(i))){
                System.out.println(str.charAt(i));
                st.push(str.charAt(i));
                System.out.println(st);
            }else{
                System.out.println(st+" before pop");
                st.pop();
                System.out.println(st+" after pop");
                count++;
            }
        }

        while(!st.empty()){
            resstr.append(st.firstElement());
            System.out.println(st+" after append pop");
            System.out.println(st.firstElement()+" this is the first element");
            st.remove(0);
        }
        if(count == 0){
            System.out.println(str);
        }
        System.out.println(resstr.toString());

    }
}
