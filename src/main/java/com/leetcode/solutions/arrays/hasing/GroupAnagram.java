package com.leetcode.solutions.arrays.hasing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> groups = new HashMap<>();
        for(String str : strs){
            groups.computeIfAbsent(getKey(str), v -> new ArrayList<>()).add(str);
        }
        return groups.values().stream().collect(Collectors.toList());
    }

    private String getKey(String str){
        char chars[] = new char[26];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            chars[c - 'a']++;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagram ga = new GroupAnagram();
        System.out.println(ga.groupAnagrams(strs));
    }
}
