package oops_concepts.kunal.Human;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{1,2,3,4,5};
    }

    public Human(Human h){
        this.age=h.age;
        this.name=h.name;
        this.arr=h.arr;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        //this does shallow copy
       // return super.clone();
        //another way of shallow copy
        Human twin=(Human) super.clone();
        //deep copy
        twin.arr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
