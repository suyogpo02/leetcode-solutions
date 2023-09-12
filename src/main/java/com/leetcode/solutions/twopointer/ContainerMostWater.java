package com.leetcode.solutions.twopointer;

public class ContainerMostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while( start < end){
            int min = Math.min(height[start], height[end]);
            int area = min * (end - start);
            max = Math.max(area, max);
            if(height[start] >= height[end]) {
                end-- ;
            } else {
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        ContainerMostWater containerMostWater = new ContainerMostWater();
        System.out.print("Container with most water is " + containerMostWater.maxArea(height));

    }
}
