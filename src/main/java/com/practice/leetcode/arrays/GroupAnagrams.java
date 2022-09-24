package com.practice.leetcode.arrays;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            anagramMap.computeIfAbsent(getKey(str), val -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }

    private static String getKey(String str) {
        char[] arr = new char[26];
        for (char c : str.toCharArray()) {
            arr[c - 'a']++;
        }
        return new String(arr);
    }

}
