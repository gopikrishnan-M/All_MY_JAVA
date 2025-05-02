package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Romove {
    public static void main(String[] args) {
        String s="coputeraeiou";
        char[] arr=s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!='a'&&arr[i]!='e'&&arr[i]!='i'&&arr[i]!='o'&&arr[i]!='u'){
                System.out.print(arr[i]);
            }
        }

    }
}
