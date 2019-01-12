package com.leetCode;

import java.util.*;

public class Solution331 {

    /** 每增加一个数字会增加一个位置，每出现一个#减少一个位置。最后，如果need刚好为0，则可以建树 */
    public boolean isValidSerialization(String preorder) {
        if(preorder.length() == 1 && preorder.charAt(0) == '#'){
            return true;
        }
        if(preorder.length() < 3){
            return false;
        }
        int need = 1;
        for (String val : preorder.split(",")) {
            if(need == 0){
                return false;
            }
            need -= " #".indexOf(val);
        }
        return need == 0;
    }

    public static void main(String[] args) {
        Solution331 solution331 = new Solution331();
        System.out.println(solution331.isValidSerialization("9,#,#,1"));
    }

}
