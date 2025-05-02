package Leetry;

public class MergeSort {
    public ListNode sortList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid= middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);

    }
    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail =dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail. next= list1;
                list1=list1.next;
                tail = tail. next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next=(list1!=null)?list1:list2;
        return dummyHead.next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode mid=head;
        while(head!=null&&head.next!=null){
            mid=(mid==null)?head:mid.next;
            head=head.next.next;
        }
        ListNode realmid=mid.next;
        mid.next=null;
        return realmid;
    }
}
