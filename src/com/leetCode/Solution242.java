package com.leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Solution242 {
//        2
//    8 8 6 4
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] cs1 = s.toCharArray();
        char[] cs2 = t.toCharArray();
        return Arrays.equals(cs1, cs2);
    }

    private String[] sort(String s){
        String[] strs = s.split("");
        for (int i = 0; i < strs.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < strs.length; j++) {
                if(strs[minIndex].compareTo(strs[j]) > 0){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                String temp = strs[i];
                strs[i] = strs[minIndex];
                strs[minIndex] = temp;
            }
        }
        return strs;
    }


    public static void main(String[] args) {
        Solution242 solution242 = new Solution242();
        System.out.println(solution242.isAnagram("anagram", "nagaram"));
//        System.out.println(solution242.sort("anagram"));
//            solution242.isAnagram("")
//        Random random = new Random();
//        String[] arr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr[i] = random.nextInt(10 + "");
//        }
//        System.out.println(Arrays.toString(solution242.sort(arr)));
    }
    

}
