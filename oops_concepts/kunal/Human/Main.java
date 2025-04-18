package oops_concepts.kunal.Human;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1=new Human(21,"Gopi");
        Human kriz=new Human(h1);//this way using new keyword uses more time which causes overhead so try to use below method

        //you can clone  by above way(or)you can do like below
        Human twin=(Human) h1.clone();
        //here this cloning does shallow copy which means for primitives it creates a new var and copy the data but for
        //non primitives it creates the obj and points it to the old obj's value which means when we make changes via
        // the twin obj it will be reflected in the original object also
        System.out.println(twin.name+" "+twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=21;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kriz.arr));//here we have only chaged the value using twin but it is also
        // chaged for kriz object
        //after doing the deep copy kriz wont change
    }
}
