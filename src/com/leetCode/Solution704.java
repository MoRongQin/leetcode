package com.leetCode;

public class Solution704 {

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        Solution704 solution704 = new Solution704();
        System.out.println(solution704.search(nums, 9));
    }

}
