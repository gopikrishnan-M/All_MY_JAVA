package Test_recursion;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr= {3,4,3,256,45,34,6};
        System.out.println("the index of max is : "+maxFinder(arr));
    }
    private static int maxFinder(int[] arr){
        return  helpMax(arr,Integer.MIN_VALUE,-1,0);
    }

    private static int helpMax(int[] arr, int max, int mInd, int i) {
        if (i == arr.length - 1) {
            return mInd;
        }
        if(arr[i]>max){
            max=arr[i];
            mInd=i;
        }
        return helpMax(arr,max,mInd,i+1);
    }
}
