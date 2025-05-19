package test4Training_Tcs;

import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weigh of clothes in grams : ");
        int wt= sc.nextInt();
        if(wt<=0) System.out.println("zero minutes");
        else if(wt>0 && wt<=2000) System.out.println("twenty five minutes");
        else if(wt>2000 && wt<=4000) System.out.println("thirty five minutes");
        else if(wt>4000 && wt<=7000) System.out.println("fourty five minutes");
        else System.out.println("OVERLOADED");

    }
}
