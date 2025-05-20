package Test_recursion;

import java.util.ArrayList;

public class AllSubSetOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        ArrayList<ArrayList<Integer>> superSet=new ArrayList<>();
        superSet.add(new ArrayList<>());
        subGen(arr,superSet,0,0);
        for(ArrayList<Integer> list:superSet){
            System.out.println(list);
        }
    }

    private static void subGen(int[] arr, ArrayList<ArrayList<Integer>> superSet, int i, int j) {
        ArrayList<Integer> temp=new ArrayList<>();
        if (i >= arr.length) {

        }
    }
}
