package Test2;

import java.util.Arrays;

public class FirsthalfSort {
    public static void main(String[] args) {
        int[] arr={5,2,9,1,6,3,8,7};
        int l=arr.length;
        int[] first=new int[l/2];
        int[] second =new int[l/2];
        int f=0,s=0;
        for (int i = 0; i < l; i++) {
            if (i < l/2) {
                first[f++]=arr[i];
            }
            else {
                second[s++]=arr[i];
            }

        }
        Arrays.sort(first);
        Arrays.sort(second);
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]+",");
        }
        for (int i = second.length-1; i >=0; i--) {
            System.out.print(second[i]+",");
        }

    }
}
