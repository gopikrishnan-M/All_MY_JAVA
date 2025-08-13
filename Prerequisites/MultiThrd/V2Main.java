package Prerequisites.MultiThrd;

public class V2Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultiThreadThing mine=new MultiThreadThing(i);
            mine.start();
        }
    }
}
