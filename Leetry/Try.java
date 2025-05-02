package Leetry;

import Linked_List.Custom.LinkdL;

public class Try {
    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
        head.next.next.next=null;
        ListNode first=helper(null,head);
        while(first!=null){
            System.out.println(first.val+",");
            first=first.next;
        }
    }

    private static ListNode helper(ListNode prev, ListNode curr) {
        if(curr==null){
            return prev;
        }
        ListNode next=curr.next;
        curr.next=prev;
        return helper(curr,next);
    }
}
