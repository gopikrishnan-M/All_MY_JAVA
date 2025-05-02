package Leetry;

public class Prob202 {
    public static void main(String[] args) {
        System.out.println(isHappy(100));
    }
    public static boolean isHappy(int num){
        ListNode fast=new ListNode(num);
        ListNode slow=new ListNode(num);
        do{
            slow.next=new ListNode(powerPandy(slow.val));
            slow=slow.next;
            fast.next=new ListNode(powerPandy(fast.val));
            fast=fast.next;
            fast.next=new ListNode(powerPandy(fast.val));
            fast=fast.next;

        }while (slow.val!=fast.val);
        if (slow.val == 1) {
            return true;
        }
        return false;
    }
    public static int powerPandy(int num){
        int pow=0;
        while (num!=0){
            int last=num%10;
            pow+=last*last;
            num/=10;
        }
        return pow;
    }
}
