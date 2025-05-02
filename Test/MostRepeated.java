package Test;

public class MostRepeated {
    public static void main(String[] args) {
        int arr[]={3,3,3,4,4,4,5,4,5,5,5,5,5};
        int occur[]=new int[9];
        for (int i = 0; i < arr.length; i++) {
            occur[arr[i]]++;
        }
        int max=0;
        for (int i = 0; i < occur.length; i++) {
            if(max<occur[i]){
                max=i;
            }
        }
        System.out.println(max);
    }
}
