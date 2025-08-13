package Prerequisites.MultiThrd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ThreadExample t=new ThreadExample(1,3);
        t.start();
        ThreadExample t1=new ThreadExample(4,6);
        t1.start();
        ThreadExample t2=new ThreadExample(7,9);
        t2.start();

        ExecutorService ex= Executors.newFixedThreadPool(5);
    }
}
