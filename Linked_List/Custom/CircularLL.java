package Linked_List.Custom;

public class CircularLL {
    Node head;
    Node tail;
    int size;

    public CircularLL(){
        this.head=null;
        this.tail=null;
        size=0;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        if (head == null) {
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }

    public void insert(int after,int val){
        Node temp=find(after);
        Node node = new Node(val);
        node.next=temp.next;
        temp.next=node;

        if (node.next == head) {
            tail=node;
        }
        size++;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        if (head == null) {
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        head=node;
        size++;
    }

    public void display(){
        Node temp=head;
        int count=0;
        do {
            if(temp==tail){
                System.out.println(temp.val);
                temp=temp.next;
                count++;
                break;
            }
            System.out.print(temp.val + " -> ");
            temp=temp.next;
            count++;
        } while (temp != head);
        System.out.print("^");
        for (int i = 1; i <= count ; i++) {
            System.out.print("    ");
        }
        System.out.println("  |");
        System.out.print("| ");
        for (int i = 1; i <= count ; i++) {
            System.out.print("----");
        }
        System.out.print(" |");

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

    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
