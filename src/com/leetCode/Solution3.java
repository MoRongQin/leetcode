package com.leetCode;

//76要去做
public class Solution3 {
    /**
     * 滑动窗口
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = -1;
        int[] freq = new int[256];
        int res = 0;
        while(l < s.length()){
            if((r + 1) < s.length() && freq[s.charAt(r + 1)] == 0){
                freq[s.charAt(++r)]++;
            }else {
                freq[s.charAt(l++)]--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring("bbbbb"));
    }

}
