package Stack;

public class CustomStack {
    int[] data;
    int ptr=-1;
    private static final int DEFAULT_SIZE=10;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data=new int[size];
    }

    public int pop() throws CustomExceptions{
        if(ptr==-1)
            throw new CustomExceptions("cannot pop an empty stack");
        else return data[ptr--];
    }

    public int peek() throws CustomExceptions{
        if(ptr==-1)
            throw new CustomExceptions("cannot peek an empty stack");
        else return data[ptr];
    }

    public boolean isFull(){
        return ptr==DEFAULT_SIZE;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

    public boolean push(int integer){
        if (isFull()) {
            System.out.println("the stack is full!!!");
            return false;
        }
        ptr++;
        data[ptr]=integer;
        return true;
    }


}
