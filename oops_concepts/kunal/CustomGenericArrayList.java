package oops_concepts.kunal;

import java.util.Arrays;
import java.util.List;

public class CustomGenericArrayList<T extends Number> {
    //number is a class when we extend it to T data type we can only enter number datatype or subclasses of number
    //to the arraylist
    // lets see what is wild card
    /*public void getList(List<? extends Number> arr){
        //do something
        //if you give ? extends Number  you can use sub classes of number you can also use <Number> which will only
        //allow number datatype .
    }*/
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenericArrayList(){

        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(T ipdata){
        if(isFull()){
            resize();
        }
        this.data[size++]= ipdata;
    }
    private boolean isFull(){
        return size==data.length;
    }

    private void resize(){
        Object[] temp=new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public T remover(){
        T removed=(T)(data[size--]);
        return removed;
    }

    public T get( int index ){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Float> CstmArr=new CustomGenericArrayList();
        CstmArr.add(3.4f);
        CstmArr.add(4.3f);
        CstmArr.add(1.3f);
        System.out.println(CstmArr);
    }

}
