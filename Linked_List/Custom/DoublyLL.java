package Linked_List.Custom;

public class DoublyLL {
    Node head;
    int size;

    public DoublyLL() {
        this.size = 0;
        this.head=null;
    }

    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }

    public void insertFist(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if (head!= null) {
            head.prev=node;
        }
        head=node;
        size++;
    }

    public void insert(int after, int val){
        Node temp=find(after);
        Node node = new Node(val);
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        if (node.next != null) {
            node.next.prev=node;
        }
        size++;

    }

    public Node find(int val){
        Node temp=head;
        while (temp != null) {
            if (temp.val == val) {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        node.next=null;
        Node last=head;

        if (head == null) {
            node.prev=null;
            head=node;
            return;
        }
        while (last.next != null) {
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        size++;
    }

    public void display(){
        Node temp=head;
        while (temp != null) {
            System.out.print( temp.val + " <--> " );
            temp=temp.next;
        }
        System.out.print("END");
    }

    public Node get(int index){
        Node temp=head;

        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        return temp;

    }

}
