package Test2;

public class Frequency {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,3,5,5};
        int[] count=new int[9];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i+":"+count[i]);
            }
        }
    }
}
