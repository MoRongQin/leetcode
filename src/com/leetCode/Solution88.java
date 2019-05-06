package com.leetCode;

import java.util.Arrays;

//215

/**
 * [4,5,6,0,0,0]
 * 3
 * [1,2,3]
 * 3
 */
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0){
            return;
        }
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if(i < m && nums1[i] > nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
            }
            else if(i >= m){
                if(i == m){
                    j = 0;
                }
                nums1[i] = nums2[j++];
            }
        }
    }

    public static void main(String[] args) {
        Solution88 solution88 = new Solution88();
        int[] nums1 = {1,3,4,0,0,0};
        int[] nums2 = {1,2,3};
        solution88.merge(nums1,3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
