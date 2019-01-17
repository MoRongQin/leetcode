package com.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution17 {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.equals("")){
            return new ArrayList<>();
        }
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        List<String> list = new ArrayList<>();
        for (String key : digits.split("")) {
            String s = map.get(key);
            list.add(s);
        }
        List<String> result = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                char c = list.get(i).charAt(j);
                while(list.get(0).length() == i){

                }
            }
        }

        return null;
    }



}
