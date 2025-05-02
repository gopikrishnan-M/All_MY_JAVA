package Queue;

public class CircularQueue {
    protected int[] data;
    protected int end=0;
    protected int front=0;
    int size=0;
    private static final int DEFAULT_SIZE=10;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data=new int[size];
    }

    public boolean isFull(){
        return size==data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int num){
        if( isFull() ) return false;
        else{
            data[end++]=num;
            end=end%data.length;
            size++;
            return true;
        }

    }

    public int remove() throws Exception{
        if(isEmpty())
            throw new Exception("queue is empty");
        else {
            int removed=data[front++];
            front=front%data.length;
            size--;
            return removed;
        }
    }

    public int front() throws Exception{
        if(isEmpty())
            throw new Exception("queue is empty");
        else{
            return data[front];
        }
    }

    public void display(){
        if(isEmpty())
            System.out.println("the queue is empty");
        else {
            int i=front;
            do{
                System.out.print(data[i]+" <- ");
                i++;
                i=i%data.length;
            }while (i!=end);
        }
    }
}
