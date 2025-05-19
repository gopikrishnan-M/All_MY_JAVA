package test4Training_Tcs;

public class GreaterThanPrior {
    public static void main(String[] args) {
        int[] arr={7,3,4,5,9,0,8,10};
        int count=0;
        for(int n:arr){
            if(n>=arr[0]) count++;
        }
        System.out.println(count);
    }
}
