package com.leetCode;

import java.util.Arrays;

public class Solution438 {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int num = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i] - nums[i - 1];
            if(temp > num){
                num = temp;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Solution438 solution438 = new Solution438();
        int[] arr = {3,6,9,1};
        System.out.println(solution438.maximumGap(arr));
    }
}
