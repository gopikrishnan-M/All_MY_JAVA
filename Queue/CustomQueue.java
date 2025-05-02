package Queue;

public class CustomQueue {
    int[] data;
    int end=0;
    private static final int DEFAULT_SIZE=10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data=new int[size];
    }

    public boolean isFull(){
        return end==data.length;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int num){
        if( isFull() ) return false;
        else{
            data[end++]=num;
            return true;
        }

    }

    public int rempve() throws Exception{
        if(isEmpty())
            throw new Exception("queqe is empty");
        else{
            int removed= data[0];
            for (int i = 1; i < end; i++) {
                data[i-1]=data[i];
            }
            end--;
            return removed;
        }
    }

    public int front() throws Exception{
        if(isEmpty())
            throw new Exception("queue is empty");
        else{
            return data[0];
        }
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }
}
