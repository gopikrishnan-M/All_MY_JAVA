package Leetry;

public class MergeKSorted {
    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(4);
        head1.next.next=new Node(7);

        Node head2=new Node(2);
        head2.next=new Node(5);
        head2.next.next=new Node(8);

        Node head3=new Node(3);
        head3.next=new Node(6);
        head3.next.next=new Node(9);

        Node ans=mergeEM(head1,head2,head3);
    }

    private static Node mergeEM(Node head1, Node head2, Node head3) {
        Node ans=new Node();
        Node temp=ans;



        return ans.next;
    }
}
class Node {
    int val;
    Leetry.Node next;

    public Node() {
    }

    public Node(int val, Leetry.Node next) {
        this.next = next;
        this.val = val;
    }

    Node(int x) {
        val = x;
        next = null;
    }
}
