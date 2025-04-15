package oops_concepts.kunal;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int number){
        if(isFull()){
            resize();
        }
        data[size++]=number;
    }
    private boolean isFull(){
        return size==data.length;
    }

    private void resize(){
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remover(){
        int removed=data[size--];
        return removed;
    }

    public int get( int index ){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
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
        CustomArrayList mine=new CustomArrayList();
        mine.add(4);
        mine.add(3);
        mine.add(6);
        System.out.println(mine);
    }

}
