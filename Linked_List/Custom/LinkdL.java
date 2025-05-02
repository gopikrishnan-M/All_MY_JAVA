package Linked_List.Custom;

//import Linked_List.probtry.ListNode;

public class LinkdL {
    public Node head;
    public Node tail;
    public int size;

    public LinkdL(){
        this.size=0;
        this.head = null;
        this.tail = null;
    }

    //recursive insertion of nodes in linked list
    public void recursiveInsert(int val,int index){
        head=helper(val,index,head);
    }

    public Node helper(int val,int index,Node node){
        if (index == 0) {
            Node temp=new Node(val,node);
            size++;
            return temp;
        }

        node.next=helper(val,index-1,node.next);
        return node;

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



    public class Node{
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.next = next;
            this.val = val;
        }
    }
}
