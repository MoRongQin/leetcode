package com.leetCode;

public class Solution209 {

    public int minSubArrayLen(int s, int[] nums) {
        int l = 0;
        int r = -1;
        int sum = 0;
        int ret = nums.length + 1;
        while(l < nums.length){
            if(r + 1 < nums.length && sum < s){
                sum += nums[++r];
            }else{
                sum -= nums[l++];
            }
            if(sum >= s){
                ret = Math.min(ret, (r - l) + 1);
            }
        }
        if(ret != nums.length + 1){
            return ret;
        }
        return 0;
    }

}
