package Test_recursion;

public class SmallestElement {
    public static void main(String[] args) {
        System.out.println(minFinder(new int[] {-1,3,45,3,9,-1,-233,566}));
    }
    private static int minFinder(int[] arr){
        return  helpMin(arr,Integer.MAX_VALUE,-1,0);
    }

    private static int helpMin(int[] arr, int min, int mInd, int i) {
        if (i == arr.length - 1) {
            return mInd;
        }
        if(arr[i]<min){
            min=arr[i];
            mInd=i;
        }
        return helpMin(arr,min,mInd,i+1);
    }
}
