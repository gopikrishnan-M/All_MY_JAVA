package ExceptionHandling;

import java.util.Scanner;

public class Handler {
    public static void main(String[] args) {
        int a=10;
        int b=4;
        div(a,b);
        try {
            int c=a/b;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            Scanner sc=new Scanner(System.in);
            System.out.println("please enter the value greater than zero");
            a= sc.nextInt();
        }
        finally {//only one finally block can be there but there can be multiple catch,throw.
            System.out.println("no matter what this will always execute");
        }

    }
    public static int div(int a , int b) throws ArithmeticException{//throws may throw an exception when this method is
        //called the body of the function may throw an exception
        if (b == 0) {
            throw new ArithmeticException("please enter a number greater than  zero");
        }
        return a/b;
    }
}
