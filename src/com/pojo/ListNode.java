package com.pojo;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode(int arr[]){
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = arr[0];
        ListNode cur = this;
        for(int i = 1 ; i < arr.length ; i++){
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    public ListNode add(ListNode node, int val){
        if(node == null){
            return new ListNode(val);
        }
        node.next = add(node.next, val);
        return node;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while( cur != null){
            sb.append(cur.val);
            sb.append("->");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }

}
