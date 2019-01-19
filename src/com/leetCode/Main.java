package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String test(ListSplit listSplit, int n, int k){
        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        listSplit.split(list, k);
        long end = System.currentTimeMillis();
        return end - start + "毫秒";
    }
    public static void main(String[] args) {
        ListSplit split1 = new Example();
        ListSplit split2 = new ListSplitImpl();
        int n = 10000000;
        System.out.println(test(split1, n, 100));
        System.out.println(test(split2, n, 100));
    }

}
