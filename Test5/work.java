package Test5;

import java.util.ArrayList;
import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        ArrayList<ArrayList<Integer>> players= new ArrayList<>();
        for(int i=0;i<l;i++){
            int size= sc.nextInt();
            ArrayList<Integer> temp=new ArrayList<>();
            for (int j = 0; j < size; j++) {
                int swt= sc.nextInt();
                temp.add(swt);
            }
            players.add(temp);
            temp=new ArrayList<>();
        }
        for(ArrayList<Integer> abb:players){
            System.out.println(abb);
        }
    }
}
