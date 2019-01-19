package com.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution179 {

    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i] + "");
        }
        Collections.sort(list, (o1, o2) -> {
            String s1 = o1.substring(0, 1);
            String s2 = o2.substring(0, 1);
            if(s1.compareTo(s2) > 0){
                return -1;
            }else if(s1.compareTo(s2) < 0){
                return 1;
            }else{
                int n = s1.length() > s2.length() ? s1.length() : s2.length();
                for (int i = 1; i < n; i++) {
                    String s3 = o1.substring(i - 1, i);
                    String s4 = o2.substring(i - 1, i);
                    if(s3.compareTo(s4) > 0){
                        return 1;
                    }else if(s3.compareTo(s4) < 0){
                        return -1;
                    }
                }
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution179 solution179 = new Solution179();
        int[] num = {3,30,34,5,9};
        System.out.println(solution179.largestNumber(num));
    }

}
