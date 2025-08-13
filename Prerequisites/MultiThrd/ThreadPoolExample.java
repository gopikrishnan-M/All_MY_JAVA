package Prerequisites.MultiThrd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(3 );
        Employee e1=new Employee(1,100);
        Employee e2=new Employee(2,99);
        Employee e3=new Employee(3,88);
        Employee e4=new Employee(4,77);
        Employee e5=new Employee(5,66);
        Employee e6=new Employee(6,55);
        Employee e7=new Employee(7,67);
        Employee e8=new Employee(8,88);
        Employee e9=new Employee(9,98);
        List<Employee> empList=new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);

        for(Employee emp:empList){
            ex.submit(new SalaryCalculation(emp));
            System.out.println("threading");
        }

    }
}
class Employee{
    int id;
    double hourlyPay;
    double salary;
    public Employee(int id,double hourlyPay){
        this.id=id;
        this.hourlyPay=hourlyPay;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
}
