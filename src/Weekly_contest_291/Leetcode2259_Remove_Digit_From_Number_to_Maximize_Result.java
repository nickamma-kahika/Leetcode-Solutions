package Weekly_contest_291;

import java.util.ArrayList;

public class Leetcode2259_Remove_Digit_From_Number_to_Maximize_Result {
    public static void main(String[] args) {
        String str = "133235";
        char target = '3';
        long max = Long.MIN_VALUE;

        StringBuilder str2 = new StringBuilder(str);
//        System.out.println(str2);

        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == target) {
                str2.delete(i, i + 1);
                max = Math.max(max, Long.parseLong(String.valueOf(str2)));
                str2.insert(i, target);
            }
        }

        System.out.println(Long.toString(max)+ "-> this is max");

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == target){
//                list.add(i);
//            }
//        }
//        int num = Integer.parseInt(str);
//        System.out.println(list);
//
//        for (int i=0;i<list.size();i++){
//            StringBuilder temp = new StringBuilder();
//            int j = i;
//            while(j<str.length()){
//                if(j != list.get(i)){
//                    temp.append(str.charAt(j));
//                }
//                j++;
//            }
//
//
//        }
//
//        System.out.println(num);
    }
}
