package com.leetcode.solutions.arrays;

public class ValidAnagram {
    //https://leetcode.com/problems/valid-anagram/description/

    public boolean isAnagram(String s, String t) {
        return getKey(s).equals(getKey(t));
    }

    private String getKey(String str){
        char []carr = new char[26];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            carr[c - 'a']++;
        }
        return new String(carr);
    }

    public static void main(String []args){
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram va = new ValidAnagram();
        boolean isAnagram = va.isAnagram(s, t);
        System.out.println( s + " and " + t + " are " + (isAnagram ? "anagram" : "not anagram"));
        assert isAnagram;
    }

}
