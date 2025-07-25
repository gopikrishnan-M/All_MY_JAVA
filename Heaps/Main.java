package Heaps;

public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap=new Heap<>();
        for(int i=19;i>=0;i=i-3){
            heap.insert(i);
        }
        System.out.println(heap.remove());
        System.out.println(heap.heapSort());




    }
}
