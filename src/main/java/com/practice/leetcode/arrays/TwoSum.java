package com.practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        final int[] result = twoSum(nums, target);
        assert result[0] == 0;
        assert result[1] == 1;
        System.out.println("indexes of two numbers whose sum is " + target + " are " + result[0] + " and " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numIndexMap.containsKey(diff)) {
                result[0] = numIndexMap.get(diff);
                result[1] = i;
                break;
            } else {
                numIndexMap.put(nums[i], i);
            }
        }

        return result;

    }
}
