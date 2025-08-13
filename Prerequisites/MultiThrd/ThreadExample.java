package Prerequisites.MultiThrd;

public class ThreadExample extends Thread{
    int start;
    int end;
    public ThreadExample(int start,int end){
        this.start=start;
        this.end=end;
    }
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
