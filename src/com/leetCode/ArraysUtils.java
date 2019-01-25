package com.leetCode;

import java.util.Random;

public class ArraysUtils {

    public static int[] generateArray(int n){
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100000);
        }
        return arr;
    }

    public static void validateSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] > arr[i]){
                throw new RuntimeException("排序错误");
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
