package oops_concepts.kunal.compare;

public class Student implements Comparable<Student>{
    //Comparable is an interface with generic types
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);
        return diff;
    }

    @Override
    public String toString() {
        return rollno+" "+ marks;
    }
}
