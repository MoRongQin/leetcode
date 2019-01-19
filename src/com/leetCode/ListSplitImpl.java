package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class ListSplitImpl implements ListSplit {

    /**
     *
     * @param list
     * @param k     K个一份
     * @return
     */
    @Override
    public List<List<Integer>> split(List<Integer> list, int k){
        int num = list.size() / k;
        if((list.size() % k) != 0){
            num++;
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            List<Integer> list2 = new ArrayList<>();
            for (int j = i * k; j < (i + 1) * k; j++) {
                if(j < list.size()){
                    list2.add(list.get(j));
                }else{
                    break;
                }
            }
            lists.add(list2);
        }
        return lists;
    }

}
