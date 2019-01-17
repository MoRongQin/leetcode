package com.leetCode;

public class Solution520 {

    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || word.substring(1, word.length()).equals(word.substring(1, word.length()).toLowerCase());
    }

    public static void main(String[] args) {
        Solution520 solution520 = new Solution520();
        System.out.println(solution520.detectCapitalUse("USA"));
        System.out.println(solution520.detectCapitalUse("FlaG"));
    }
}
