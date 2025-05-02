package Test2;

public class RepeatElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,4};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+",");
            }
        }
    }
}
