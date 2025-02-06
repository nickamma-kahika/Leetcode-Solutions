package Random;

import java.sql.SQLOutput;

public class Leetcode647_Palindromic_Substrings {
    public static void main(String[] args) {
        String str = "abc";
        int count = 0;
        boolean flag = false;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<str.length();i++){
            stringBuilder.append(str.charAt(i));
            if(isPalindrome(stringBuilder)){
                count++;
            }


            for(int j=i+1; j<str.length(); j++){
                stringBuilder.append(str.charAt(j));
                if(isPalindrome(stringBuilder)){
                    count++;
                }
            }
            stringBuilder.setLength(0);
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(StringBuilder s) {
        StringBuilder s2 = new StringBuilder();
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
