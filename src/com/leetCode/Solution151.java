package com.leetCode;

public class Solution151 {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        int i = 0;
        int j = strs.length - 1;
        while(i < j){
            strs[i++] = strs[j--];
        }
        StringBuilder res = new StringBuilder();
        for (int k = 0; k < strs.length; k++) {
            res.append(strs[k] + " ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution151 solution151 = new Solution151();
        System.out.println(solution151.reverseWords("the sky is blue"));
    }

}
