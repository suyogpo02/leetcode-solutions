package com.leetcode.solutions.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int []result = new int[nums.length];
        for(int i = 0; i<nums.length ; i++){
            result[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for(int i = nums.length -1; i>=0 ; i--){
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums =  {1,2,3,4};
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        int []result = product.productExceptSelf(nums);
        Arrays.stream(result).mapToObj(num -> num + " ").forEach(System.out::print);
    }

}
