package oops_concepts.Phone;

import java.util.Scanner;

public class MobileMain {

    public static void main(String[] args) {
        Mobiles[] marr=new Mobiles[10];

        marr[0]=new Mobiles("samsung","s24",2024,75000,"oneUI");
        marr[1]=new Mobiles("samsung","s25",2025,100000,"oneUI");
        marr[2]=new Mobiles("samsung","a25",2022,15000,"oneUI");
        marr[3]=new Mobiles("oneplus","12",2024,60000,"oxygen os");
        marr[4]=new Mobiles("oneplus","12r",2024,46000,"oxygen os");
        marr[5]=new Mobiles("oneplus","13",2025,75000,"oxygen os");
        marr[6]=new Mobiles("apple","mini",2023,30000,"ios");
        marr[7]=new Mobiles("apple","a17",2022,100000,"ios");
        marr[8]=new Mobiles("blackberry","b1",2015,15000,"blackos");
        marr[9]=new Mobiles("realme","6",2020,12000,"realme ui");
        Scanner sc=new Scanner(System.in);
        System.out.println("Your choices :");
        System.out.println("1.only price");
        System.out.println("2.only brand");
        System.out.println("3.price and brand");

        int a = repeatu();
        System.out.println("value pf a"+ a);
        switch (a) {
            case 1 -> {
                System.out.println("enter your budget");
                int low = sc.nextInt();
                sc.nextLine();
                Mobiles.pricefilter(marr, low);
            }
            case 2 -> {
                System.out.print("enter your brand : ");
                String brand = sc.nextLine();
                Mobiles.showbrand(marr, brand);
            }
            case 3 -> {
                System.out.print("enter your budget : ");
                int low = sc.nextInt();
                sc.nextLine();
                System.out.print("enter your brand : ");
                String brand = sc.nextLine();
                Mobiles.priceAndBrand(marr, brand, low);
            }
            default -> System.out.println("wrong input");
        }
    }
    public static int repeatu(){
        System.out.print("enter ur choice from the above options: ");
        Scanner sc=new Scanner(System.in);
        int fcall= sc.nextInt();sc.nextLine();
        if(fcall<=0||fcall>=4){
            System.out.println("goiyaala correct ha kudu illana ....kondruven  ");
         return repeatu();

        }
        else {
           return fcall;
        }
    }

}
