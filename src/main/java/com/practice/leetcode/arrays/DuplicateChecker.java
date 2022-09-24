package com.practice.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 2, 1};
        boolean containsDuplicate = containsDuplicate(nums);
        assert containsDuplicate;
        System.out.println(containsDuplicate);

        int[] numsNotDuplicate = {1, 4, 6, 8, 2};
        containsDuplicate = containsDuplicate(numsNotDuplicate);
        assert !containsDuplicate;
        System.out.println(containsDuplicate);

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            } else {
                hashSet.add(num);
            }
        }

        return false;

    }

}
