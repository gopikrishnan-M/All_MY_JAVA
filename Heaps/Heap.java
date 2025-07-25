package Heaps;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap(){
        list=new ArrayList<>();
    }

    private void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private int left(int index){
        return index*2+1;
    }

    private int right(int index){
        return index*2+2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if (index == 0) {
            return;
        }
        int p=parent(index);
        if(list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap(i.e heap underflow)");
        }
        T temp=list.get(0);
        T last=list.remove(list.size()-1);
        if (!list.isEmpty()) {
            list.set(0,last);
            downHeap(0);
        }
        return temp;
    }
    private void downHeap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);
        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min=left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min=right;
        }
        if (min != index) {
            swap(min,index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data=new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    //say an unsorted array is given convert it into a min heap
    //the condition is parent node should be smaller than its child nodes
    //here we should not consider leaf nodes coz we need to compare from parent
    //as this is a complete binary tree like implementation if there are n nodes,
    //nodes after n/2+1 are leaf nodes so we don't consider them.
    //now from n/2 to 1 check every node weather they are in correct position or not
    //by calling downheap method
}
