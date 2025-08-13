package Prerequisites.MultiThrd;

public class MultiThreadThing extends Thread{
    int threadnumber;
    MultiThreadThing(int threadnumber){
        this.threadnumber=threadnumber;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "from thread" + threadnumber);
            if(threadnumber==3){
                throw new RuntimeException();//this is to illustrate that even if a thread fails and there occurs an exceptioin
                //the other threads continue to perform
                //some methods are join()-it keeps other threads waithin until this thread is complete
                // isAlive()
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){}

        }
    }
}
