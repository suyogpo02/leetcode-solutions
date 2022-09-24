package com.practice.leetcode.bucktting;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3};
        int k = 2;
        final int[] topKFrequent = topKFrequent(nums, k);
        Arrays.stream(topKFrequent).forEach(System.out::println);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        int max = getnumberCountMap(nums, numCountMap);
        ArrayList<Integer> []bucketArray = new ArrayList[max+1];
        for(Map.Entry<Integer, Integer> entry : numCountMap.entrySet()){

            ArrayList<Integer> numbers = bucketArray[entry.getValue()];
            if(numbers == null){
                numbers = new ArrayList<>();
            }
            numbers.add(entry.getKey());
            bucketArray[entry.getValue()] = numbers;
        }

        int []result = new int[k];
        int j = 0;
        for(int i = bucketArray.length-1; i>=0 ; i--){
            List<Integer> numbers = bucketArray[i];
            if(numbers != null){
                for(Integer number : numbers){
                    if(j < k ){
                        result[j++] = number;
                    }
                }
            }
        }

        return result;
    }

    private static int getnumberCountMap(int []nums, Map<Integer, Integer> numCountMap){
        int max = 0;
        for(int num : nums){
            if(numCountMap.containsKey(num)){
                int count  = numCountMap.get(num);
                count++;
                numCountMap.put(num, count);
                max = Math.max(max, count);
            }else{
                numCountMap.put(num, 0);
            }
        }
        return max;
    }

}
