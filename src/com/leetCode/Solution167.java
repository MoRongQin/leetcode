package com.leetCode;

import java.util.Arrays;

public class Solution167 {
    //暴力解法
//    public int[] twoSum(int[] numbers, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 1; j < numbers.length; j++) {
//                if((numbers[i] + numbers[j]) == target && i < j){
//                    res[0] = i + 1;
//                    res[1] =j + 1;
//                    return res;
//                }
//            }
//        }
//        return res;
//    }

    //优化，对撞指针
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                return new int[]{i + 1, j + 1};
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution167 solution167 = new Solution167();
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(solution167.twoSum(numbers,9)));
    }

}
