package Linked_List.Custom;

public class Main {
    public static void main(String[] args) {
         /*LinkdList mine=new LinkdList();
         mine.insertFirst(3);
         mine.insertFirst(4);
         mine.insertFirst(9);
         mine.insertFirst(32);
         mine.insertFirst(5);
         mine.insertFirst(8);
         mine.insertFirst(6);
         mine.insertLast(13);
         mine.insertLast(21,3);
         mine.display();
        System.out.println(mine.deleteFirst());;
         mine.display();
        System.out.println(mine.deleteLast());
        mine.display();
        System.out.println(mine.delete(4));
        mine.display();*/

        /*DoublyLL dll=new DoublyLL();
        dll.insertFist(5);
        dll.insertFist(4);
        dll.insertFist(3);
        dll.insertFist(2);
        dll.insertFist(1);
        dll.display();
        System.out.println();
        dll.insertLast(7);
        dll.display();
        System.out.println();
        dll.insertLast(5,6);
        dll.display();*/

        CircularLL cll=new CircularLL();
        cll.insertLast(1);
        cll.insertLast(2);
        cll.insertLast(3);
        cll.insertLast(4);

        cll.insertLast(6);
        cll.insertLast(7);
        cll.insert(4,5);
        cll.display();
    }
}
