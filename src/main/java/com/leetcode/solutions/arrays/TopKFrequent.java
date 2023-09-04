package com.leetcode.solutions.arrays;
import java.util.*;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> numCountMap = countNumbers(nums);
        ArrayList<Integer> bucketArray[] = new ArrayList[nums.length + 1];
        numCountMap.forEach((key, value) -> {
            if(bucketArray[value] == null){
                bucketArray[value] = new ArrayList<>();
            }
            bucketArray[value].add(key);
        });

        int result[] = new int[k];
        int j = 0;
        for(int i = bucketArray.length -1; i>=0; i--){
            var list = bucketArray[i];
            if(list != null){
                for(int element : list){
                    if(k <= 0){
                        return result;
                    }
                    result[j] = element;
                    j++;
                    k--;
                }
            }
        }
        return result;
    }

    private Map<Integer, Integer> countNumbers(int[] nums){
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int num : nums){
            if(numMap.containsKey(num)){
                numMap.put(num, numMap.get(num) + 1);
            }else{
                numMap.put(num, 1);
            }
        }
        return numMap;
    }

    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3};
        int k = 2;
        TopKFrequent tkf = new TopKFrequent();
        var result = tkf.topKFrequent(nums, k);
        for(int num : result){
            System.out.print(" " + num);
        }
    }
}
