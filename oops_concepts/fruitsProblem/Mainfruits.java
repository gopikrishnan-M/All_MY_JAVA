package oops_concepts.fruitsProblem;

import java.util.Scanner;

class Mainfruits{
    public static void main(String[] args) {
        int[] array={3,4,3,56,6,6,5};
        //Fruits[] farr={(555,"Apple",200,5),(777,"orange",150,4),(333,"banana",100,4;;),(888,"avacado",250,4)};
        Fruits[] farr=new Fruits[4];
        farr[0]=new Fruits(555,"Apple",200,5);
        farr[1]=new Fruits(777,"orange",150,4);
        farr[2]=new Fruits(333,"banana",100,4);
        farr[3]=new Fruits(888,"avacado",250,4);
        System.out.print("enter your rating :");
        Scanner sc=new Scanner(System.in);
        int rating=sc.nextInt();
        Fruits obj=Fruits.maxRating(farr,rating);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getPrice());
        System.out.println(obj.getRating());

    }

}