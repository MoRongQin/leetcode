package com.leetCode;

import com.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目分析：根据二叉搜索树的性质可得，按中序遍历，即可得到一个递增的序列，所以问题转换为，对于一个递增的序列，求相邻元素的最小绝对差。
 */
public class Solution224 {
    int min = Integer.MAX_VALUE;
    TreeNode preNode = null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    public void inorder(TreeNode node){
        if(node == null) {
            return;
        }
        inorder(node.left);
        if(preNode != null) {
            min = Math.min(min, Math.abs(node.val - preNode.val));
        }
        preNode = node;
        inorder(node.right);
    }

    public static void main(String[] args) {
        Solution224 solution224 = new Solution224();
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(7);
        root.left = left;
        root.right = right;
        System.out.println(solution224.getMinimumDifference(root));
    }

}
