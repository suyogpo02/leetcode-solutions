package com.leetcode.solutions.arrays.hasing;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    // https://leetcode.com/problems/contains-duplicate/description/
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n : nums){
            if(numSet.contains(n)){
                return true;
            }
            numSet.add(n);
        }
        return false;
    }

    public static void main(String [] args){
        int []nums = {1, 2, 3, 50, 100};
        DuplicateInArray dia = new DuplicateInArray();
        System.out.println("Array " + (dia.containsDuplicate(nums) ? "contains " : "does not contain") +
                "duplicate");

        int [] duplicateNums = {200, 100, 500, 100};
        System.out.println("Array " + (dia.containsDuplicate(duplicateNums) ? "contains " : " does not contain") +
                "duplicate");
    }

}
