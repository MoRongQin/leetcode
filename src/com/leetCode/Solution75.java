package com.leetCode;

import java.util.Arrays;

public class Solution75 {

//    public void sortColors(int[] nums) {
//        if(nums.length < 2){
//            return;
//        }
//        int[] arr = new int[3];
//        for(int i = 0; i < nums.length; i++){
//            arr[nums[i]]++;
//        }
//        int index = 0;
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i]; j++){
//                nums[index++] = i;
//            }
//        }
//    }

    //[1,0,2,1,2]
    /**
     * 优化
     * @param nums
     */
    public void sortColors(int[] nums) {
        if(nums.length < 2){
            return;
        }
        int zero = -1;  //nums[0...zero] == 0
        int two = nums.length;  //nums[two...n-1] == 2
        for (int i = 0; i < two; ) {
            if(nums[i] == 1){
                i++;
            }else if(i < two && nums[i] == 2){
                two--;
                swap(nums, i, two);
            }else{
                zero++;
                swap(nums, zero, i);
                i++;
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();
        int[] nums = new int[]{2,0,2,1,1,0};
        solution75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

}
