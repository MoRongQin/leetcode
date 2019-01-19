package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example implements ListSplit {
    
    @Override
    public List<List<Integer>> split(List<Integer> list, int k) {
        int listSize = list.size();

        List<List<Integer>> segmentList = new ArrayList<>((listSize / k) + 1);

        Integer[] array = list.toArray(new Integer[listSize]);

        // 计算需要拆分几次
        double count = Math.ceil((double) listSize / k);

        for (int i = 0; i < count; i++) {
            Integer[] temp;
            // 当前位置
            int pos = i * k;

            if (i != count - 1) {
                temp = new Integer[k];
            } else {
                // 最后一次大小需要计算还剩多少个元素
                temp = new Integer[listSize - pos];
            }

            System.arraycopy(array, pos, temp, 0, temp.length);
            segmentList.add(Arrays.asList(temp));
        }

        return segmentList;
    }
}
