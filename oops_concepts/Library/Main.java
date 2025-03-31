package oops_concepts.Library;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int LibBalance=10000;

        ArrayList<Books> library=new ArrayList<>();

        library.add(new Books(1,"Harry Potter and the Sorcerer’s Stone","J.K. Rowling",1997,1245));

        library.add(new Books(2,"The Lord of the Rings: The Fellowship of the Ring","J.R.R. Tolkien",1954,2155));

        library.add(new Books(3,"The Hobbite","J.R.R. Tolkien",1937,1160));

        library.add(new Books(4,"The Great Gatsby","F. Scott Fitzgerald",1925,910));

        library.add(new Books(5,"The Hunger Games","Suzanne Collins",2008,1075));

        library.add(new Books(6,"To Kill a Mockingbird","Harper Lee",1960,995));

        library.add(new Books(7,"the shining","Stephen King",1997,1330));

        library.add(new Books(8,"Jurassic Park","Michael Crichton",1990,1200));

        library.add(new Books(9,"The Godfather","Mario Puzo",1967,1410));

        library.add(new Books(10,"it","Stephen King",1986,1495));

        boolean isNotOver =true;

        while (isNotOver){

            System.out.println("current library balance is  "+LibBalance);

            System.out.println("This library has  "+ library.size()+ "  Books");

            System.out.println("Your choices :");

            System.out.println("1.add book");

            System.out.println("2.remove book");

            System.out.println("3.show all");

            System.out.println("4.show only one");

            System.out.println("5.buy book");

            System.out.println("6.sell book");

            System.out.println("7.show balance");

            System.out.println("8.Exit");

            System.out.print("Enter your option: ");
            int option= sc.nextInt();
            sc.nextLine();

            switch (option){

                case 1 ->{
                    //adding

                    int sno=library.size()+1;

                    System.out.println("The serial number of the book you are going to enter is  " + sno);

                    System.out.print("Enter the name of the book ");

                    String name=sc.nextLine();

                    System.out.print("Enter the author of the book ");

                    String author=sc.nextLine();

                    System.out.print("Enter the year during which the book was published ");

                    int year= sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter the price of the book ");

                    int price= sc.nextInt();

                    sc.nextLine();

                    library.add(new Books(sno,name,author,year,price));

                }

                case 2 ->{
                    //remove

                    System.out.print("Enter the serial number of the book you want to remove : ");

                    int removeSno=sc.nextInt();

                    Books.removeBook(removeSno,library);

                }

                case 3 ->{

                    //show all
                    Books.showAll(library);
                }
                case 4 ->{
                    //show only

                    System.out.print("Enter the serial number of the book :");

                    int showSno= sc.nextInt();

                    Books.show(showSno,library);

                }
                case 5 ->{
                    //buy

                    System.out.println("current library balance is "+ LibBalance);

                    System.out.print("Enter the price of the book you want to buy :");

                    int priceOfBook= sc.nextInt();sc.nextLine();

                    if (priceOfBook <= LibBalance) {
                        LibBalance=LibBalance-priceOfBook;
                        System.out.println("Enter the detail of the book you have purchased to add it in the library");
                        int sno=library.size()+1;
                        System.out.println("The serial number of the book you are going to enter is  " + sno);
                        System.out.print("Enter the name of the book ");
                        String name=sc.nextLine();
                        System.out.print("Enter the author of the book ");
                        String author=sc.nextLine();
                        System.out.print("Enter the year during which the book was published ");
                        int year= sc.nextInt();
                        sc.nextLine();
                        int price= priceOfBook;
                        System.out.println("the price of the book is  "+ price);
                        System.out.println("current balance of the library is  "+ LibBalance);
                        library.add(new Books(sno,name,author,year,price));
                    }
                    else {
                        System.out.println("your current balance is insufficient to buy books try selling some");
                        System.out.println("your need to earn  "+ (int)(priceOfBook-LibBalance)+"  to buy this book");
                    }
                }

                case 6 ->{
                    //sell

                    System.out.println("current library balance is  "+ LibBalance);

                    System.out.print("Enter the serial number of the book you want to sell :");

                    int sellSno= sc.nextInt();

                    if (sellSno > library.size()) {
                        System.out.println("please enter a valid serial number from zero to "+ library.size());
                    }
                    else {
                        int soldValue= (int) library.get(sellSno-1).price;

                        LibBalance+=soldValue;

                        System.out.println("The price of the book you have sold is  "+ soldValue);

                        System.out.println("your balance has been updated sucessfully....your current balance is  :" +LibBalance);

                        Books.removeBook(sellSno,library);
                    }

                }
                case 7 ->{
                    //check
                    System.out.println("Balance is  "+ LibBalance);
                }
                case 8 ->{
                    //exit
                    System.out.println("thankyou for using the library");
                    isNotOver =false;
                }
            }

        }
    }
}
