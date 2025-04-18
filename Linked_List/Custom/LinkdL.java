package Linked_List.Custom;

public class LinkdL {
    private Node head;
    private Node tail;
    private int size;

    public LinkdL(){
        this.size=0;
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if (tail == null) {
            tail=head;
        }

        size++;
    }

    public void insert(int val,int index){
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;

    }

    public void insertLast(int val){
        //if tail is not provided then we must traverse till last i.e temp equals to null then add the last node's
        // pointer to this node
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deleteFirst(){
        int val= head.val;
        head=head.next;
        if (head == null) {
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        int val=tail.val;
        tail=get(size-2);
        tail.next=null;
        size--;
        return val;

    }

    public int delete(int index){
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
        Node temp=get(index-1);
        int val=temp.next.val;
        temp.next=temp.next.next;
        size--;
        return val;

    }

    public Node get(int index){
        Node temp=head;
        for (int i = 1; i < index ; i++) {
            temp=temp.next;
        }
        return temp;
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

    public void display(){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }



    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }
}
