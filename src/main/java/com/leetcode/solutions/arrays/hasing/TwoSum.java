package com.leetcode.solutions.arrays.hasing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numPositionMap = new HashMap<>();
        int []result = new int[2];
        for(int i = 0; i <= nums.length; i++ ){
            int remaining = target - nums[i];
            if(numPositionMap.containsKey(remaining)){
                result[0] = numPositionMap.get(remaining);
                result[1] = i;
                return result;
            }else{
                numPositionMap.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String []args){
        int [] nums = {2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(" Equation is :-  " + nums[result[0]] + " + " + nums[result[1]] + " is " + target );

    }
}
