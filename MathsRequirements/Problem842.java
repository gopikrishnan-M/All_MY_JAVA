package MathsRequirements;

import java.util.Arrays;

class Problem842 {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        //System.out.println(Arrays.toString(flipAndInvertImage(arr)));
        //the above sout statement prints only the address values coz tostring should only be used for one d array so,use
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
//                       (or)
        //this prints each row one by one using to string method with the help of for loop
/*      for (int[] row : arr) {
    System.out.println(Arrays.toString(row));
}
*/
    }
    public static int[][] flipAndInvertImage(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <=(arr[row].length-1)/2; col++) {
                int temp=arr[row][col]^1;
                arr[row][col]=arr[row][arr[row].length-1-col]^1;
                arr[row][arr[row].length-1-col]=temp;
            }
        }
        return arr;
    }
}