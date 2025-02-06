package Daily_Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Leetocde1790_Check_if_One_String_Swap_Can_Make_Strings_Equal {
    public static void main(String[] args) {
        String s1 = "npv", s2 = "zpn";
        if(s1.equals(s2)){
            System.out.println(true);
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                arr.add(i);
                System.out.println(i);
            }
            if(arr.size()>2){
                System.out.println("arr.size() > 2");
                System.out.println(false);
            }
        }
        if(arr.size() == 2){
            if(s1.charAt(arr.get(0)) == s2.charAt(arr.get(1))){
                System.out.println(true);
            }else{
                System.out.println("inside second if ");
                System.out.println(false);
            }
        }

    }
}
