package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class InBuilt {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que.peek());//just returns the head
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());

        //Dequeue whichi faster than linked list and stack

        Deque<Integer> deque=new ArrayDeque<>();
        // add and remove from both the ends
        //can do remove first remove last ,etc ,etc
    }
}


