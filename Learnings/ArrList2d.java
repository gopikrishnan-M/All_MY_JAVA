package Learnings;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList2d {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list2d=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2d.add(new ArrayList<>());
        }
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int val=sc.nextInt();
                list2d.get(i).add(val);
            }

        }
        System.out.println(list2d);

    }
    static void or2dArrListWay(){
        ArrayList<ArrayList<Integer>> arr2d=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows for the array list");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            arr2d.add(new ArrayList<>());
            System.out.print("Enter number of elements for "+(i+1)+" row");
            int col=sc.nextInt();
            for (int j = 0; j <col ; j++) {
                System.out.print("Enter the "+(j+1)+" value");
               arr2d.get(i).add(sc.nextInt());
            }

        }
        sc.close();
        System.out.println(arr2d);

    }
}
