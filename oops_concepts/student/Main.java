package oops_concepts.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Students[] arr=new Students[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the name");
            String naam=sc.nextLine();
            System.out.println("enter the roll");
            int roll=sc.nextInt();sc.nextLine();
            System.out.println("enter the department");
            String department=sc.nextLine();
            System.out.println("enter the cgpa");
            float cgpa=sc.nextFloat();sc.nextLine();
            System.out.println("enter the attendance");
            float attendance=sc.nextFloat();sc.nextLine();
            arr[i]=new Students(naam,roll,department,cgpa,attendance);

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].name);

        }
        Students.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
            System.out.println(arr[i].roll);
        }
        Students.topper(arr);
        final int rank=1;
    }
}
