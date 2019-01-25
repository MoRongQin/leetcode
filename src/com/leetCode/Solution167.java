package com.leetCode;

import java.util.Arrays;

public class Solution167 {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if((numbers[i] + numbers[j]) == target && i < j){
                    res[0] = i + 1;
                    res[1] =j + 1;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution167 solution167 = new Solution167();
        int[] numbers = {5, 25 ,75};
        System.out.println(Arrays.toString(solution167.twoSum(numbers,100)));
    }

}
