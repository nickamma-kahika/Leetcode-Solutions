package Random;

import java.util.HashMap;

public class Leetcode387_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String str  = "loveleetcode";

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0) + 1);
            else
                System.out.println("in else block");
                map.put(str.charAt(i), 1);
        }
        int ans = -1;

        for(int i=0;i<str.charAt(i);i++){
            if(map.get(str.charAt(i)) == 1){
                ans = i;
                break;
            }

        }
        System.out.println(ans);
    }
}
