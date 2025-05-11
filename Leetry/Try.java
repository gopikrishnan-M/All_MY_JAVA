package Leetry;

import Linked_List.Custom.LinkdL;

import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int[] arr={9,5,4,-2,-2,-1,-9,-34};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void reverser() {
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
