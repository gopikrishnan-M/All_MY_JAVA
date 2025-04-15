package oops_concepts.kunal.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student kris=new Student(13,1100.00f);
        Student zark=new Student(21,1000.0f);
        Student gokul=new Student(12,1010.0f);

        Student[] arr={kris,zark,gokul};
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr); this builin function calls our compareto mentod then sort the array of students
//        System.out.println(Arrays.toString(arr));

        //you can also compare the students mark using comparator agument of sory(arr,Comparator) metod
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks-o2.marks);
            }
        });
        // you can also use lamda function instead of above
        //Arrays.sort(arr, (o1, o2) -> (int)(o1.marks-o2.marks)); like this
        System.out.println(Arrays.toString(arr));

        if(kris.compareTo(zark)<0){
            System.out.println("zark scored more marks");
            System.out.println(kris.compareTo(zark));
        }
    }
}
