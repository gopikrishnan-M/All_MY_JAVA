package Leetry;

public class TryLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(4);
        ListNode tail=head.next.next.next;
        tail.next=head.next;
        System.out.println(detectCycle(head).val);
    }
    public static ListNode detectCycle(ListNode head) {
        int l=findLength(head);
        ListNode first=head;
        ListNode second=head;
        if(l==0){
            return null;
        }
        while(l>0){
            first=first.next;
            l--;
        }
        while(first!=second){
            first=first.next;
            second=second.next;
        }

        return first;
    }
    public static int findLength(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                int count=0;
                do{
                    slow=slow.next;
                    count++;
                }while(fast!=slow);
                return count;
            }
        }
        return 0;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val,ListNode next) {
        this.next = next;
        this.val = val;
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}

