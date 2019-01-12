package com.leetCode;

import com.pojo.ListNode;

public class Solution25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode check = head;
        int num = 0;
        //检查链表长度是否满足翻转
        while(num++ < k && check != null){
            check = check.next;
        }
        if(num == k){
            int count = 0;
            ListNode cur = head;
            ListNode pre = head;
            ListNode next = null;
            while(count < k && pre != null){
                next = pre.next.next;       //3
                cur = pre.next;         //2
                pre.next = pre;         //1

                count++;
            }
            if (next != null) {
                // head 为链表翻转后的尾节点
                head.next = reverseKGroup(next, k);
            }
            // prev 为链表翻转后的头结点
            return pre;
        }else{
            return head;
        }
    }

}
