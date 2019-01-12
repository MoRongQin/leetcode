package com.leetCode;

import java.util.Stack;

public class Solution71 {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for(String str : path.split("/")){
            if(str.equals("") || str.equals(".")){
                continue;
            }else if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(str);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.insert(0, "/" + stack.pop());
        }
        if(res.toString().equals("")){
            return "/";
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution71 solution71 = new Solution71();
        System.out.println(solution71.simplifyPath("/home/"));
    }

}
