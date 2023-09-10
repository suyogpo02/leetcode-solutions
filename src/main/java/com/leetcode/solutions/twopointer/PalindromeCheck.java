package com.leetcode.solutions.twopointer;

public class PalindromeCheck {
    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            char sc = s.charAt(start);
            if(isNotAlphaNumeric(sc)){
                start++;
                continue;
            }

            char ec = s.charAt(end);
            if(isNotAlphaNumeric(ec)){
                end--;
                continue;
            }

            if(Character.toLowerCase(sc) != Character.toLowerCase(ec) ){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    private boolean isNotAlphaNumeric(char c){
        return !Character.isLetterOrDigit(c);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        PalindromeCheck pc = new PalindromeCheck();
        System.out.print("String - " + s  + " - is " + (pc.isPalindrome(s) ? " palindrome " : " not palindrome" ));
    }
}
