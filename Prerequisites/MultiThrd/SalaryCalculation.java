package Prerequisites.MultiThrd;


public class SalaryCalculation implements Runnable{
    Employee e=null;
    public SalaryCalculation(Employee e){
        this.e=e;
    }
    @Override
    public void run() {
        //to do
    }
    public void calculate(Employee e){
        double salary=e.hourlyPay*8*30;
        e.setSalary(salary);

    }
}
