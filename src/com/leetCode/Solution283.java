package com.leetCode;

import java.util.Arrays;

public class Solution283 {

    /**
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                if(i != j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j++] = temp;
                }else{
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution283 solution283 = new Solution283();
        int[] nums = {0,1,0,3,12};
        solution283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
