package oops_concepts.Library;

import java.util.ArrayList;

public class Books {
    int serialNumber;
    String name;
    String author;
    int year;
    double price;

    public Books(int serialNumber, String name, String author, int year, double price){
        this.serialNumber=serialNumber;
        this.name=name;
        this.author=author;
        this.year=year;
        this.price=price;
    }

    public static void show(int showSno,ArrayList<Books> library){
        if(showSno>library.size()){
            System.out.println("NO book is found with the given serial number");
            System.out.println("please enter a valid serial number from zero to "+ library.size());
        }
        else {
            System.out.println(library.get(showSno-1).serialNumber);
            System.out.println(library.get(showSno-1).name);
            System.out.println(library.get(showSno-1).author);
            System.out.println(library.get(showSno-1).year);
            System.out.println(library.get(showSno-1).price);
            System.out.println("********************************************************************************************");
        }
    }
    public static void removeBook(int removeSno, ArrayList<Books> library){
       if(removeSno>library.size()){
           System.out.println("NO book is found with the given serial number");
           System.out.println("please enter a valid serial number from zero to "+ library.size());
       }
        else {
           library.remove(removeSno-1);
           //show all
           showAll(library);
        }
    }

    public static void showAll(ArrayList<Books> library){
        System.out.println("Books available in the library are :)");
        for (int i = 0; i < library.size(); i++) {
            if (i == 0) {
                System.out.println("********************************************************************************************");
            }
            System.out.println(library.get(i).serialNumber);
            System.out.println(library.get(i).name);
            System.out.println(library.get(i).author);
            System.out.println(library.get(i).year);
            System.out.println(library.get(i).price);
            System.out.println("********************************************************************************************");
        }
    }
}
