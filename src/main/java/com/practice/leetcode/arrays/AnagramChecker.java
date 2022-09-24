package com.practice.leetcode.arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String one = "aba";
        String two = "aab";
        final boolean anagram = isAnagram(one, two);
        assert anagram;
        if(anagram) {
            System.out.println("Strings " + one + " and " + two + " are anagrams of each other");
        }
    }

    public static boolean isAnagram(String s, String t) {
        return getKey(s).equals(getKey(t));
    }

    private static String getKey(String str){
        char []arr = new char[26];
        for(char c : str.toCharArray()){
            arr[c -'a']++;
        }
        return new String(arr);
    }


}
