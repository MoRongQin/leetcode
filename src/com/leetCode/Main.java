package com.leetCode;

import com.pattern.UserUtil;
import com.pojo.Single;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void maopao(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void xuanze(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }else{
                    break;
                }
            }
            if(i != minIndex){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int temp = arr[i];
            for(; j > 0 && arr[j - 1] > temp; j--){
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
//        int[] arr = ArraysUtils.generateArray(1000);
//        insertSort(arr);
//        System.out.println("last = " + Arrays.toString(arr));
//        ArraysUtils.validateSort(arr);
    }






}
