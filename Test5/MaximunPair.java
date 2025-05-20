package Test5;

import java.util.Scanner;

public class MaximunPair {
    public static void main(String[] args) {
        int[] arr={21,12,13,-12,-2};
        int pm=finder(arr,true);
        int nm=finder(arr,false);
        System.out.println(pm+nm);
    }
    public static int finder(int[] arr,boolean isPositive){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(isPositive){
                if(arr[i]>0&&arr[i]>max){
                    max=arr[i];
                }
            }
            else {
                if(arr[i]<0&&arr[i]>max){
                    max=arr[i];
                }
            }
        }
        return max;
    }
}

