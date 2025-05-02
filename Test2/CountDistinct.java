package Test2;

import java.util.Arrays;

public class CountDistinct {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5};
        int[] count=new int[9];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
//        System.out.println(Arrays.toString(count));
        int sum=0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
