package com.leetCode;

import java.util.Map;
import java.util.TreeMap;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        return null;
    }
}

class Tree{
    private class Node{
        public boolean isWord;
        public Map<Character, Node> next;
        public Node(boolean isWord){
            this.isWord = isWord;
            next = new TreeMap<>();
        }
        public Node(){
            this(false);
        }
    }
}
