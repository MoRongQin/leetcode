package com.leetCode;

public class Solution125 {

    public boolean isPalindrome(String s) {
        if(s == null || s.length() <= 1){
            return true;
        }
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!Character.isLetterOrDigit(c1)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(c2)){
                j--;
                continue;
            }
            if(c1 != c2){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        System.out.println(solution125.isPalindrome("A man, a plan, a canal: Panama"));
    }

}
